# PeopleCode Parser Built with ANTLR 4

## About

This project provides an implementation of a PeopleCode parser for programs of all types (event PeopleCode and Application Classes).

It is initially based on PeopleTools 8.56, but built-in functions (the language constructs most susceptible to change between PeopleTools versions) are not referenced individually in the grammar, thereby making it suitable for other PeopleTools versions as well.

## Goals

The primary goal of this parser is to enable applications which analyze PeopleCode and validate coding standards. An example of such an application is the [Static Code Analyzer](https://github.com/lbaca/PSCodeAnalyzer). Said application can use the parser to enforce rules such as "`SQLExec` function calls shall not use string literals as the first argument" (see [test_parser.py](https://github.com/lbaca/PeopleCodeParser/blob/main/tests/test_parser.py#L22-L44) for this precise example).

Another application of the parser is to build documentation generators, such as `AppClassDoc` (_**TODO**: Provide a link to it once it's on GitHub_).

As mentioned in the [About](#About) section above, the parser grammar does not reference individual built-in functions, which a parser aimed at, say, compiling the language would need to do. For example, it will not enforce the fact that the `SQLExec` function requires a first argument that is either a string or a SQL definition reference, and then has zero or more literals, variable references, Record Field references, etc. Valid PeopleCode programs should be successfully parsed by this parser (with the one exception described further below), but it would also be possible to write a syntactically correct PeopleCode program that would fail to compile due to semantic issues, as in the following absurd example:

```
Local SOME:APPLICATION:Class &anObject;

If SQLExec(&anObject) > &anObject Then
   SomeMadeUpFunction(&anObject);
End-If;
```

This PeopleCode snippet would be accepted as syntactically valid by the parser but would fail to compile in Application Designer.

## Parser Implementation

See the [main project site](https://github.com/lbaca/PeopleCodeParser) for details about the parser's implementation.

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

## Acknowledgements

The parser was intially written out of simple curiosity, but was later included as part of the deliverables for my Master of Science dissertation at the University of Liverpool, titled "A Framework for Customizing ERP Systems to Increase Software Reuse and Reduce Rework When Challenged with Evolving Requirements." I mention this primarily in gratitude to my employer, who graciously waived their claim to intellectual property on my work as part of this academic pursuit.
