import os.path

from setuptools import find_packages, setup


here = os.path.abspath(os.path.dirname(__file__))

with open(os.path.join(here, 'README.md'), encoding='utf-8') as f:
    long_description = f.read()

setup(
    name='peoplecodeparser',
    version='1.1.5',
    description='A PeopleCode parser built with ANTLR 4',
    long_description=long_description,
    long_description_content_type='text/markdown',
    python_requires='~=3.6',
    author='Leandro Baca',
    author_email='leandrobaca77@gmail.com',
    url='https://github.com/lbaca/PeopleCodeParser',
    packages=find_packages(),
    install_requires=['antlr4-python3-runtime>=4.9.2'],
    classifiers=[
        'Development Status :: 5 - Production/Stable',
        'Intended Audience :: Developers',
        'Programming Language :: Other',
        'Programming Language :: Python :: 3',
        'Programming Language :: Python :: 3.6',
        'Programming Language :: Python :: 3.7',
        'Programming Language :: Python :: 3.8',
        'Programming Language :: Python :: 3.9',
        'License :: OSI Approved :: MIT License',
        'Operating System :: OS Independent',
        'Topic :: Software Development',
        'Topic :: Software Development :: Interpreters',
        'Topic :: Software Development :: Libraries :: Python Modules',
    ],
    keywords=('parser peoplesoft peoplecode source application-class '
              'application-package antlr antlr4'),
    include_package_data=True,
)
