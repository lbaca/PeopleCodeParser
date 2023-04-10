# PeopleCode Parser Built with ANTLR 4

## About

This project provides an implementation of a PeopleCode parser for programs of all types (event PeopleCode and Application Classes).

It is initially based on PeopleTools 8.56, but built-in functions (the language constructs most susceptible to change between PeopleTools versions) are not referenced individually in the grammar, thereby making it suitable for other PeopleTools versions as well.

## Goals

The primary goal of this parser is to enable applications which analyze PeopleCode and validate coding standards. An example of such an application is the [Static Code Analyzer](https://github.com/lbaca/PSCodeAnalyzer). Said application can use the parser to enforce rules such as "`SQLExec` function calls shall not use string literals as the first argument" (see [test_parser.py](tests/test_parser.py#L22-L44) for this precise example).

Another application of the parser is to build documentation generators, such as [AppClassDoc](https://github.com/lbaca/appclassdoc).

As mentioned in the "[About](#About)" section above, the parser grammar does not reference individual built-in functions, which a parser aimed at, say, compiling the language would need to do. For example, it will not enforce the fact that the `SQLExec` function requires a first argument that is either a string or a SQL definition reference, and then has zero or more literals, variable references, Record Field references, etc. Valid PeopleCode programs should be successfully parsed by this parser (with the one exception described further below), but it would also be possible to write a syntactically correct PeopleCode program that would fail to compile due to semantic issues, as in the following absurd example:

```
Local SOME:APPLICATION:Class &anObject;

If SQLExec(&anObject) > &anObject Then
   SomeMadeUpFunction(&anObject);
End-If;
```

This PeopleCode snippet would be accepted as syntactically valid by the parser but would fail to compile in Application Designer.

## Parser Implementation

The parser is built with [ANTLR 4](http://www.antlr.org/). As is customary for ANTLR 4 parsers, it consists of separate lexer and parser definitions. The lexer is provided in both [Java](src/java/PeopleCodeLexer.g4)- and [Python](src/python3/PeopleCodeLexer.g4)-flavored versions that employ language-specific semantic predicates. The [parser](src/common/PeopleCodeParser.g4) is common to both languages. ANTLR 4 limitations make it so that even though the Java- and Python-specific versions of the lexer share 95% of the same code, this cannot be factored out into a common file to be imported by both. (As a side note, if you use Visual Studio Code for development, these same limitations result in Mike Lischke's very good [ANTLR 4 extension](https://github.com/mike-lischke/vscode-antlr4) throwing errors because the parser and lexer are not in the same directory.)

As hinted at in the "[Goals](#Goals)" section above, it is assumed that this parser will be used to parse PeopleCode programs which have been successfully compiled by the PeopleSoft Application Designer. The PeopleTools compiler enforces certain stylistic rules (e.g., three spaces per indentation level, compile-time automatic switching of single-quoted strings to double-quoted ones, keyword capitalization, newlines after `If ... Then`). However, the parser will (within reason) be more flexible with regard to enforcing style. For example, a compiled PeopleCode program will never contain the lines:

```
/* ! */   eNd-eVaLuAte  ;  
```

or:

```
If   TrUe tHen WinMessage('True!')  elsE      WinMessage('How did I get here?!') eNd-iF ;
```

(if not in a comment), but the parser will accept them as valid, just like the compiler would before enforcing its styling.

ANTLR 4 grammars require an entry point when parsing input. This PeopleCode parser defines two such rules:

* [`appClass`](src/common/PeopleCodeParser.g4#L20-L23) for Application Classes; and
* [`program`](src/common/PeopleCodeParser.g4#L28-L30) for event-driven PeopleCode programs.

Another feature of ANTLR 4 parsers is that they can emit tokens on various channels. Unless otherwise indicated, tokens are emitted on the default channel. It is common to see whitespace (which is itself a token) emitted on a `WHITESPACE` channel, which in many cases (e.g., for PeopleCode or Java) can be ignored, but in others (e.g., for Python or YAML) has significance. The PeopleCode parser defines the following additional channels:

* `API_COMMENTS`: where Javadoc-like API comments are emitted (used by [AppClassDoc](https://github.com/lbaca/appclassdoc));
* `COMMENTS`: where all other commented-out text is emitted;
* `DIRECTIVES`: where Directive PeopleCode statements are emitted.

## Exceptions to Successful Parsing

The parser was tested against 96,136 PeopleCode programs and Application Classes that fall into one of the following categories:

* They were delivered by Oracle as part of the PeopleSoft HCM 9.2 application (image \#32); or
* They were custom code developed by me for one of my customers; or
* They were part of the development carried out as part of my dissertation (see the [acknowledgements](#Acknowledgements) below).

Of these PeopleCode programs and Application Classes, 96,134 (99.998%) were parsed successfully, and only two Page PeopleCode programs failed to parse. Both errors are attributable to quirks that occur with Directive PeopleCode. Resolving Directive PeopleCode would require a pre-compilation task, but since this is out of scope for the aforementioned [goals](#Goals), the parser simply treats Directive PeopleCode as if it weren't there.

The first error occurs in the `HR_MSS_CT_CONF_FL` Page Activate event, reproduced here in its entirety:

```
import HR_GUIDED_SELF_SERVICE:Pages:*;

Declare Function UseGSSActivityGuide PeopleCode FUNCLIB_HR_GSS.HR_MSS_CT_NAME FieldFormula;

Local HR_GUIDED_SELF_SERVICE:Pages:ConfirmationPageActivate &Confirmation;

&Confirmation = create HR_GUIDED_SELF_SERVICE:Pages:ConfirmationPageActivate();
#If #ToolsRel >= "8.55" #Then
   If UseGSSActivityGuide() Then
      &Confirmation.Activate( True);
   Else
      &Confirmation.Activate( False);
   End-If
#Else
&Confirmation.Activate( False);
#End-If;
```

Note how the `End-If` immediately above the `#Else` directive does not have a trailing semicolon. If the Directive PeopleCode statements were not present, the semicolon would actually be required.

The second error occurs in the `PT_HEADERPAGE` Page Activate event (excerpted below):

```
#If #toolsrel < "8.55.13" #Then
   If Not (IsLogoutEnabled()) Then
#Else
   /* 855-13a - Support guest disabling of Signout via permission */
   If Not (IsLogoutEnabled()) Or
         (IsIScriptAuthorized("WEBLIB_PORTAL", "PT_PORTAL_HDRLINK", "FieldFormula", "IScript_HideSignOutLink", %Action_UpdateDisplay) And
            Not (IsUserInRole("PeopleSoft Administrator"))) Then
   #End-If
   
   PT_WORK.PT_BUTTON_LOGOUT.Visible = False;
End-If;
```

When the Directive PeopleCode statements are ignored, the two `If` statements on the second and fifth lines become unbalanced with the single `End-If` on the last line.

Of the 96,136 PeopleCode programs tested, only 256 (0.27%) included Directive PeopleCode, of which only these two (0.78% of all programs with Directive PeopleCode, and 0.002% overall) cause parsing issues. Considering that custom PeopleCode will rarely (if ever) include Directive PeopleCode statements, and that even if it did it would be unlikely to manifest one of these two quirks, I believe we can live with these odds.

## Building the Parser

The project's build tasks are implemented using [Invoke](https://www.pyinvoke.org/), so even if you only wish to build the Java version of the parser, you will still need Python 3.6+ installed locally. Conversely, as ANTLR 4 is provided as a Java library, you will need JDK 1.7+ even if you only intend to build the Python version of the parser.

Once these requirements are fulfilled, follow these steps:

1. Make sure you have Invoke installed:

   ```bash
   pip install invoke
   ```

2. To run the Python tests you will also need virtualenv and PyTest:

   ```bash
   pip install virtualenv pytest
   ```

3. Clone the project locally:

   ```bash
   git clone https://github.com/lbaca/PeopleCodeParser.git
   ```

4. Run the desired Invoke build task:

   ```bash
   cd PeopleCodeParser

   # To build only the Java version:
   inv build-java

   # To build only the Python version:
   inv build-python

   # To build both versions:
   inv build
   ```

5. To run the tests:

   ```bash
   # To test only the Java version:
   inv test-java

   # To test only the Python version:
   inv test-python

   # To test both versions:
   inv test
   ```

When building the Java version, you can define the `JAVA_HOME` environment variable to point to the desired JDK for compilation and packaging. If `JAVA_HOME` is not set, the Invoke task will search the `PATH` for a JDK. The Java version will be packaged into the `target/java/deploy/peoplecode-parser.jar` archive.

The Python version will be packaged into the `target/python3/dist/peoplecodeparser-<version>.tar.gz` archive. This can then be installed using `pip` for downstream usage.

Note that the sample PeopleCode programs and Application Classes included in the [`test`](test) directory were purposely selected among the largest available, to put the parser through its paces. As such, the tests (the Python tests in particular) may take a few minutes to complete.

## Using the Parser

ANTLR 4 is powerful yet complex. Some resources are freely available to learn how to use it effectively when writing parsers, such as Gabriele Tomassetti's [ANTLR Mega Tutorial](https://tomassetti.me/antlr-mega-tutorial/) and [the official ANTLR 4 documentation](https://github.com/antlr/antlr4/blob/master/doc/index.md). However, the most complete resource is ANTLR creator Terrance Parr's book "[The Definitive ANTLR 4 Reference](https://pragprog.com/titles/tpantlr2/the-definitive-antlr-4-reference/)".

## Acknowledgements

The parser was intially written out of simple curiosity, but was later included as part of the deliverables for my Master of Science dissertation at the University of Liverpool, titled "A Framework for Customizing ERP Systems to Increase Software Reuse and Reduce Rework When Challenged with Evolving Requirements." I mention this primarily in gratitude to my employer, who graciously waived their claim to intellectual property on my work as part of this academic pursuit.
