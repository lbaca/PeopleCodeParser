"""Invoke tasks for the PeopleCode parser project."""

import os
import os.path
import re
import shutil
import sys
import time

from invoke import task


_ANTLR4_LIB_RE = re.compile(r'antlr-(\d+(\.\d+)+)-.+\.jar')
_COMMENT_LINE_RE = re.compile(r'(//|#) Generated from ')
_JAVA_PACKAGE = 'com.leandrobaca.peoplesoft.peoplecode.parser'
_BASE_DIR = os.path.dirname(__file__)
_COMMON_SRC_DIR = os.path.join(_BASE_DIR, 'src', 'common')
_JAVA_SRC_DIR = os.path.join(_BASE_DIR, 'src', 'java')
_PYTHON_SRC_DIR = os.path.join(_BASE_DIR, 'src', 'python3')
_JAVA_TARGET_DIR = os.path.join(_BASE_DIR, 'target', 'java')
_PYTHON_TARGET_BASE_DIR = os.path.join(_BASE_DIR, 'target', 'python3')
_PYTHON_TARGET_MODULE_DIR = os.path.join(_PYTHON_TARGET_BASE_DIR,
                                         'peoplecodeparser')
_JAVA_DEPLOY_DIR = os.path.join(_JAVA_TARGET_DIR, 'deploy')
_TARGET_JAR = 'peoplecode-parser.jar'
_ANTLR4_TEMP_FILE_RE = re.compile(r'.+\.(interp|tokens)')
_VENV_NAME = '.venv'
_TEST_DIR = os.path.join(_BASE_DIR, 'tests')


def _get_antlr_version(filename):
    """Return the version of the ANTLR 4 library."""
    result = _ANTLR4_LIB_RE.fullmatch(filename)
    if result:
        return result.group(1)


def _get_antlr_jar_path():
    """Return the full path to the ANTLR 4 library.

    If multiple versions of the library are found, the one with the
    highest version number is retained.
    """
    lib_dir = os.path.join(_BASE_DIR, 'lib')
    jar_path = None
    version = None
    with os.scandir(lib_dir) as libs:
        for lib in libs:
            if lib.is_file() and lib.name.endswith('.jar'):
                new_version = _get_antlr_version(lib.name)
                if version is None or new_version > version:
                    jar_path = lib.path
                    version = new_version
    return jar_path


def _get_java_exes(runtime_only=False):
    """Return the paths to a Java runtime, compiler and archiver.

    If the JAVA_HOME environment variable is set, it will be preferred
    over others.
    """
    java_home = os.environ.get('JAVA_HOME')
    java_bin = None
    if java_home:
        java_bin = os.path.join(java_home, 'bin')
    java_exe = shutil.which('java', path=java_bin)
    assert java_exe is not None, 'Java runtime not found'
    if runtime_only:
        javac_exe = None
        jar_exe = None
    else:
        java_bin = os.path.dirname(java_exe)
        javac_exe = shutil.which('javac', path=java_bin)
        assert javac_exe is not None, 'Java compiler not found'
        jar_exe = shutil.which('jar', path=java_bin)
        assert jar_exe is not None, 'Java archiver not found'
    print(f'Using the JDK found in {java_bin}...')
    return java_exe, javac_exe, jar_exe


def _delete_temp_files(path):
    """Delete temporary files created during lexer and parser generation."""
    print('Deleting temporary files...')
    with os.scandir(path) as tgts:
        for tgt in tgts:
            if tgt.is_file() and _ANTLR4_TEMP_FILE_RE.fullmatch(tgt.name):
                os.remove(tgt.path)


def _build_python_package(c):
    """Build the Python package."""
    print('Building Python package...')
    with c.cd(_PYTHON_TARGET_BASE_DIR):
        c.run('python setup.py sdist')
        dist_dir = os.path.join(_PYTHON_TARGET_BASE_DIR, 'dist')
        with os.scandir(dist_dir) as dist:
            for d in dist:
                if d.is_file() and d.name.endswith('.tar.gz'):
                    return d.path


def _create_venv(c, recreate_if_found=False):
    """(Re)create the virtual environment.

    Returns the command prefix for its activation.
    """
    venv_dir = os.path.join(_PYTHON_TARGET_BASE_DIR, _VENV_NAME)
    create = recreate_if_found
    if os.path.exists(venv_dir):
        if os.path.isdir(venv_dir):
            if recreate_if_found:
                print('Deleting the virtual environment...')
                # In certain conditions (e.g., when the project is in a Dropbox
                # directory), operations such as file deletions will fail because
                # the targeted files are being used. This loop will ensure the
                # files are ultimately deleted.
                while True:
                    try:
                        shutil.rmtree(venv_dir)
                        break
                    except:
                        print('Files busy, retrying...')
                        time.sleep(2)
        else:
            raise ValueError(f'{venv_dir} is not a directory')
    else:
        create = True
    if create:
        print('Initializing the virtual environment...')
        with c.cd(_PYTHON_TARGET_BASE_DIR):
            c.run(f'virtualenv "{_VENV_NAME}"')
    if os.name == 'nt':
        prefix = os.path.join(_PYTHON_TARGET_BASE_DIR, _VENV_NAME, 'Scripts',
                              'activate')
    else:
        venv_activate = os.path.join(_PYTHON_TARGET_BASE_DIR, _VENV_NAME,
                                     'bin', 'activate')
        prefix = f'source "{venv_activate}"'
    if create:
        dist_pkg = _build_python_package(c)
        if dist_pkg:
            with c.cd(_PYTHON_TARGET_BASE_DIR):
                with c.prefix(prefix):
                    c.run(f'pip install {dist_pkg} pytest')
        else:
            raise FileNotFoundError('unable to find dist package')
    return prefix


def _run_java_test(c, java_exe, rule, file_name, expected_error=None):
    """Test the Java parser on a single PeopleCode file.

    The scope of testing is limited to the ability to parse the
    program, and does not attempt to walk through it or validate
    individual tokens or rules.
    """
    success = False
    classpath = _get_antlr_jar_path()
    classpath += ';' if os.name == 'nt' else ':'
    classpath += os.path.join(_JAVA_DEPLOY_DIR, _TARGET_JAR)
    source_file = os.path.join(_TEST_DIR, file_name)
    result = c.run(f'"{java_exe}" -cp "{classpath}" org.antlr.v4.gui.TestRig '
            f'{_JAVA_PACKAGE}.PeopleCode {rule} "{source_file}" '
            f'-encoding utf-8', hide=True)
    if expected_error:
        exp_err_lines = len(expected_error.split('\n'))
        run_errors = result.tail('stderr', count=(exp_err_lines + 1)).strip()
        success = ((result.ok and not run_errors)
                or (run_errors == expected_error))
    else:
        run_errors = result.tail('stderr').strip()
        success = result.ok and not run_errors
    if not success:
        print(f'Unexpected result testing file "{file_name}":', run_errors,
              file=sys.stderr)
        sys.exit(1)


def _remove_first_comment(file_path):
    """Remove the first comment line from a generated source file.

    This is done for two reasons:
        1. To avoid generating an otherwise identical file from a
           different project directory when nothing else has changed.
        2. To avoid having individual contributors' workspace paths
           checked into git.

    The line-stripping method implemented in this function will work for
    this codebase because the generated source files are not too big.
    """
    with open(file_path, 'r', encoding='utf-8') as src:
        data = src.read().splitlines(keepends=True)
    if _COMMENT_LINE_RE.match(data[0]):
        with open(file_path, 'w', encoding='utf-8') as src:
            src.writelines(data[1:])


@task
def clean_java(c):
    """Clean the Java target."""
    print('Cleaning Java target...')
    if os.path.exists(_JAVA_TARGET_DIR):
        if os.path.isdir(_JAVA_TARGET_DIR):
            # In certain conditions (e.g., when the project is in a Dropbox
            # directory), operations such as file deletions will fail because
            # the targeted files are being used. This loop will ensure the
            # files are ultimately deleted.
            while True:
                try:
                    shutil.rmtree(_JAVA_TARGET_DIR)
                    break
                except:
                    print('Files busy, retrying...')
                    time.sleep(2)
        else:
            raise ValueError(f'{_JAVA_TARGET_DIR} is not a directory')


@task(clean_java)
def build_java(c):
    """Build the Java version of the parser."""
    antlr_lib = _get_antlr_jar_path()
    assert antlr_lib is not None, 'Unable to find the ANTLR 4 library.'
    java_exe, javac_exe, jar_exe = _get_java_exes()
    print('Generating Java lexer...')
    os.makedirs(_JAVA_DEPLOY_DIR)
    lexer_path = os.path.join(_JAVA_SRC_DIR, 'PeopleCodeLexer.g4')
    parser_path = os.path.join(_COMMON_SRC_DIR, 'PeopleCodeParser.g4')
    c.run(f'"{java_exe}" -Xmx500M -cp "{antlr_lib}" org.antlr.v4.Tool '
          f'-package "{_JAVA_PACKAGE}" -o "{_JAVA_TARGET_DIR}" "{lexer_path}"')
    print('Generating Java parser...')
    c.run(f'"{java_exe}" -Xmx500M -cp "{antlr_lib}" org.antlr.v4.Tool '
          f'-package "{_JAVA_PACKAGE}" -visitor -lib "{_JAVA_TARGET_DIR}" '
          f'-o "{_JAVA_TARGET_DIR}" "{parser_path}"')
    _delete_temp_files(_JAVA_TARGET_DIR)
    print('Removing header comment from generated source files...')
    with os.scandir(_JAVA_TARGET_DIR) as srcs:
        for src in srcs:
            if src.is_file() and src.name.endswith('.java'):
                _remove_first_comment(src.path)
    print('Compiling source code...')
    c.run(f'"{javac_exe}" -cp "{antlr_lib}" -d "{_JAVA_DEPLOY_DIR}" '
          f'"{_JAVA_TARGET_DIR}"{os.sep}*.java')
    print(f'Packaging {_TARGET_JAR}...')
    c.run(f'"{jar_exe}" -cf "{os.path.join(_JAVA_DEPLOY_DIR, _TARGET_JAR)}" '
          f'-C "{_JAVA_DEPLOY_DIR}" .')
    print('Deleting bytecode files...')
    java_package_root = _JAVA_PACKAGE.split('.', maxsplit=1)[0]
    java_package_dir = os.path.join(_JAVA_DEPLOY_DIR, java_package_root)
    # In certain conditions (e.g., when the project is in a Dropbox directory),
    # operations such as file deletions will fail because the targeted files
    # are being used. This loop will ensure the files are ultimately deleted.
    while True:
        try:
            shutil.rmtree(java_package_dir)
            break
        except:
            print('Files busy, retrying...')
            time.sleep(2)
    print('Java target built.')


@task
def clean_python(c):
    """Clean the Python target."""
    print('Cleaning Python target...')
    dist_dir = os.path.join(_PYTHON_TARGET_BASE_DIR, 'dist')
    if os.path.exists(dist_dir):
        if os.path.isdir(dist_dir):
            # In certain conditions (e.g., when the project is in a Dropbox
            # directory), operations such as file deletions will fail because
            # the targeted files are being used. This loop will ensure the
            # files are ultimately deleted.
            while True:
                try:
                    shutil.rmtree(dist_dir)
                    break
                except:
                    print('Files busy, retrying...')
                    time.sleep(2)
        else:
            raise ValueError(f'{dist_dir} is not a directory')
    if os.path.exists(_PYTHON_TARGET_MODULE_DIR):
        if os.path.isdir(_PYTHON_TARGET_MODULE_DIR):
            # In certain conditions (e.g., when the project is in a Dropbox
            # directory), operations such as file deletions will fail because
            # the targeted files are being used. This loop will ensure the
            # files are ultimately deleted.
            while True:
                try:
                    shutil.rmtree(_PYTHON_TARGET_MODULE_DIR)
                    break
                except:
                    print('Files busy, retrying...')
                    time.sleep(2)
        else:
            raise ValueError(f'{_PYTHON_TARGET_MODULE_DIR} is not a directory')


@task(clean_python)
def build_python(c):
    """Build the Python 3 version of the parser."""
    antlr_lib = _get_antlr_jar_path()
    assert antlr_lib is not None, 'Unable to find the ANTLR 4 library.'
    java_exe, _, _ = _get_java_exes(runtime_only=True)
    print('Generating Python lexer...')
    lexer_path = os.path.join(_PYTHON_SRC_DIR, 'PeopleCodeLexer.g4')
    parser_path = os.path.join(_COMMON_SRC_DIR, 'PeopleCodeParser.g4')
    c.run(f'"{java_exe}" -Xmx500M -cp "{antlr_lib}" org.antlr.v4.Tool '
          f'-Dlanguage=Python3 -o "{_PYTHON_TARGET_MODULE_DIR}" '
          f'"{lexer_path}"')
    print('Generating Python parser...')
    c.run(f'"{java_exe}" -Xmx500M -cp "{antlr_lib}" org.antlr.v4.Tool '
          f'-Dlanguage=Python3 -visitor -lib "{_PYTHON_TARGET_MODULE_DIR}" '
          f'-o "{_PYTHON_TARGET_MODULE_DIR}" "{parser_path}"')
    _delete_temp_files(_PYTHON_TARGET_MODULE_DIR)
    print('Removing header comment from generated source files...')
    with os.scandir(_PYTHON_TARGET_MODULE_DIR) as srcs:
        for src in srcs:
            if src.is_file() and src.name.endswith('.py'):
                _remove_first_comment(src.path)
    print('Copying static source files...')
    with os.scandir(_PYTHON_SRC_DIR) as srcs:
        for src in srcs:
            if src.is_file() and src.name.endswith('.py'):
                shutil.copy2(src.path, _PYTHON_TARGET_MODULE_DIR)
    _build_python_package(c)
    print('Python target built.')


@task(clean_java, clean_python)
def clean(c):
    """Clean both the Java and Python targets."""
    pass


@task(build_java, build_python)
def build(c):
    """Build both the Java and Python 3 versions of the parser."""
    pass


@task
def test_java(c):
    """Test the Java version of the parser."""
    java_exe, _, _ = _get_java_exes(runtime_only=True)
    _run_java_test(c, java_exe, 'appClass','EOCF_FILTER.FilterForm.ppl')
    _run_java_test(c, java_exe, 'appClass', 'EP_FUNCTIONS.WorkCenterUI.ppl')
    _run_java_test(c, java_exe, 'appClass', 'HRMH_SETUP.HRMHServices.ppl')
    _run_java_test(c, java_exe, 'appClass',
                   'HRS_CANDIDATE_MANAGER.CMP_CAND_EXP.UI.PageLayout.ppl')
    _run_java_test(c, java_exe, 'appClass',
                   'PSXP_RPTDEFNMANAGER.ReportDefn.ppl')
    _run_java_test(c, java_exe, 'program',
                   'FUNCLIB_EP.EP_CHKPT.FieldFormula.ppl')
    _run_java_test(c, java_exe, 'program',
                   'FUNCLIB_HR_SS.HR_SS_CONFIG_FUNC.FieldFormula.ppl')
    _run_java_test(c, java_exe, 'program',
                   'FUNCLIB_W3EBENR.PLAN_TYPE_2X.FieldFormula.ppl')
    _run_java_test(c, java_exe, 'program',
                   'PSIBLOGICAL_WRK.TREECTLEVENT.FieldFormula.ppl')
    _run_java_test(c, java_exe, 'program',
                   'PTPG_WORKREC.FUNCLIB.FieldFormula.ppl')
    # The following two tests are expected to fail (see README.md for details)
    _run_java_test(c, java_exe, 'program', 'HR_MSS_CT_CONF_FL.Activate.ppl',
                   expected_error=('line 15:0 mismatched input '
                                   "'&Confirmation' expecting {<EOF>, ';'}"))
    _run_java_test(c, java_exe, 'program', 'PT_HEADERPAGE.Activate.ppl',
                   expected_error=("line 376:0 mismatched input '<EOF>' "
                                   'expecting {ELSE, END_IF}'))
    print('All Java tests passed.')


@task
def test_python(c):
    """Test the Python version of the parser."""
    prefix = _create_venv(c)
    with c.cd(_TEST_DIR):
        with c.prefix(prefix):
            c.run('pytest')


@task(test_java, test_python)
def test(c):
    """Test both the Java and Python 3 versions of the parser."""
    pass
