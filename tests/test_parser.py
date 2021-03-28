"""Tests for the Python version of the PeopleCode parser."""

import os.path

from antlr4 import CommonTokenStream, FileStream, ParseTreeWalker

from peoplecodeparser.PeopleCodeLexer import PeopleCodeLexer
from peoplecodeparser.PeopleCodeParser import PeopleCodeParser
from peoplecodeparser.PeopleCodeParserListener import PeopleCodeParserListener


_TEST_DIR = os.path.dirname(__file__)


class SQLExecListener(PeopleCodeParserListener):
    """Rule to check for SQLExec calls with literal SQL statements."""

    def __init__(self):
        """Initialize the listener."""
        self.lines_with_sqlexec_literals = []

    def enterSimpleFunctionCall(
            self,
            ctx: PeopleCodeParser.SimpleFunctionCallContext):
        """Enter a parse tree for a simpleFunctionCall parser rule.

        This will count the number of times a SQLExec call is found with
        a string literal or an expression (as opposed to a SQL
        Definition reference). This could be enhanced to exclude "at"
        references (e.g., @("SQL." | &someVariable)), but the current
        implementation is sufficient for this test.
        """
        line = ctx.start.line
        function_name = ctx.genericID().allowableFunctionName()
        if function_name and function_name.getText().upper() == 'SQLEXEC':
            args = ctx.functionCallArguments()
            if args:
                expr = args.expression(i=0)
                if hasattr(expr, 'literal') or hasattr(expr, 'expression'):
                    self.lines_with_sqlexec_literals.append(line)
            else:
                # SQLExec with no arguments, should never happen in valid
                # PeopleCode
                assert False


def _parse_file(file_name, app_class=False):
    file_path = os.path.join(_TEST_DIR, file_name)
    file_stream = FileStream(file_path, encoding='utf-8')
    lexer = PeopleCodeLexer(file_stream)
    token_stream = CommonTokenStream(lexer)
    parser = PeopleCodeParser(token_stream)
    if app_class:
        tree = parser.appClass()
    else:
        tree = parser.program()
    return tree


def _validate_parse(file_name, capfd, app_class=False, error_text=''):
    tree = _parse_file(file_name, app_class=app_class)
    captured = capfd.readouterr()
    assert captured.err == error_text
    return tree


def test_app_class_1(capfd):
    """Validate parsing of an Application Class.

    In addition to simple parsing validation, this test will also use a
    custom listener to verify that the Application Class in question
    includes two SQLExec calls with string literals. Note that the
    Application Class has a third such call commented out, which should
    not be detected.
    """
    tree = _validate_parse('EOCF_FILTER.FilterForm.ppl', capfd, app_class=True)
    walker = ParseTreeWalker()
    listener = SQLExecListener()
    walker.walk(listener, tree)
    assert set(listener.lines_with_sqlexec_literals) == {2528, 2713}


def test_app_class_2(capfd):
    """Validate parsing of an Application Class."""
    _validate_parse('EP_FUNCTIONS.WorkCenterUI.ppl', capfd, app_class=True)


def test_app_class_3(capfd):
    """Validate parsing of an Application Class."""
    _validate_parse('HRMH_SETUP.HRMHServices.ppl', capfd, app_class=True)


def test_app_class_4(capfd):
    """Validate parsing of an Application Class."""
    _validate_parse('HRS_CANDIDATE_MANAGER.CMP_CAND_EXP.UI.PageLayout.ppl',
                    capfd, app_class=True)


def test_app_class_5(capfd):
    """Validate parsing of an Application Class."""
    _validate_parse('PSXP_RPTDEFNMANAGER.ReportDefn.ppl', capfd,
                    app_class=True)


def test_program_1(capfd):
    """Validate parsing of a PeopleCode program."""
    _validate_parse('FUNCLIB_EP.EP_CHKPT.FieldFormula.ppl', capfd)


def test_program_2(capfd):
    """Validate parsing of a PeopleCode program."""
    _validate_parse('FUNCLIB_HR_SS.HR_SS_CONFIG_FUNC.FieldFormula.ppl', capfd)


def test_program_3(capfd):
    """Validate parsing of a PeopleCode program."""
    _validate_parse('FUNCLIB_W3EBENR.PLAN_TYPE_2X.FieldFormula.ppl', capfd)


def test_program_4(capfd):
    """Validate parsing of a PeopleCode program."""
    _validate_parse('PSIBLOGICAL_WRK.TREECTLEVENT.FieldFormula.ppl', capfd)


def test_program_5(capfd):
    """Validate parsing of a PeopleCode program."""
    _validate_parse('PTPG_WORKREC.FUNCLIB.FieldFormula.ppl', capfd)


def test_error_1(capfd):
    """Verify the expected error in parsing of a PeopleCode program.

    See README.md for details.
    """
    _validate_parse('HR_MSS_CT_CONF_FL.Activate.ppl', capfd,
                    error_text=("line 15:0 mismatched input '&Confirmation' "
                                "expecting {<EOF>, ';'}\n"))


def test_error_2(capfd):
    """Verify the expected error in parsing of a PeopleCode program.

    See README.md for details.
    """
    _validate_parse('PT_HEADERPAGE.Activate.ppl', capfd,
                    error_text=("line 376:0 mismatched input '<EOF>' "
                                'expecting {ELSE, END_IF}\n'))
