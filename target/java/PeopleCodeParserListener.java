package com.leandrobaca.peoplesoft.peoplecode.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PeopleCodeParser}.
 */
public interface PeopleCodeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code AppClassProgram}
	 * labeled alternative in {@link PeopleCodeParser#appClass}.
	 * @param ctx the parse tree
	 */
	void enterAppClassProgram(PeopleCodeParser.AppClassProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AppClassProgram}
	 * labeled alternative in {@link PeopleCodeParser#appClass}.
	 * @param ctx the parse tree
	 */
	void exitAppClassProgram(PeopleCodeParser.AppClassProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceProgram}
	 * labeled alternative in {@link PeopleCodeParser#appClass}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceProgram(PeopleCodeParser.InterfaceProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceProgram}
	 * labeled alternative in {@link PeopleCodeParser#appClass}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceProgram(PeopleCodeParser.InterfaceProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PeopleCodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PeopleCodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(PeopleCodeParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(PeopleCodeParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#appPackageAll}.
	 * @param ctx the parse tree
	 */
	void enterAppPackageAll(PeopleCodeParser.AppPackageAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#appPackageAll}.
	 * @param ctx the parse tree
	 */
	void exitAppPackageAll(PeopleCodeParser.AppPackageAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#appPackagePath}.
	 * @param ctx the parse tree
	 */
	void enterAppPackagePath(PeopleCodeParser.AppPackagePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#appPackagePath}.
	 * @param ctx the parse tree
	 */
	void exitAppPackagePath(PeopleCodeParser.AppPackagePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#appClassPath}.
	 * @param ctx the parse tree
	 */
	void enterAppClassPath(PeopleCodeParser.AppClassPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#appClassPath}.
	 * @param ctx the parse tree
	 */
	void exitAppClassPath(PeopleCodeParser.AppClassPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclarationExtension}
	 * labeled alternative in {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationExtension(PeopleCodeParser.ClassDeclarationExtensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclarationExtension}
	 * labeled alternative in {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationExtension(PeopleCodeParser.ClassDeclarationExtensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclarationImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationImplementation(PeopleCodeParser.ClassDeclarationImplementationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclarationImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationImplementation(PeopleCodeParser.ClassDeclarationImplementationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclarationPlain}
	 * labeled alternative in {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationPlain(PeopleCodeParser.ClassDeclarationPlainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclarationPlain}
	 * labeled alternative in {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationPlain(PeopleCodeParser.ClassDeclarationPlainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceDeclarationExtension}
	 * labeled alternative in {@link PeopleCodeParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclarationExtension(PeopleCodeParser.InterfaceDeclarationExtensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceDeclarationExtension}
	 * labeled alternative in {@link PeopleCodeParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclarationExtension(PeopleCodeParser.InterfaceDeclarationExtensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceDeclarationPlain}
	 * labeled alternative in {@link PeopleCodeParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclarationPlain(PeopleCodeParser.InterfaceDeclarationPlainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceDeclarationPlain}
	 * labeled alternative in {@link PeopleCodeParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclarationPlain(PeopleCodeParser.InterfaceDeclarationPlainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExceptionSuperClass}
	 * labeled alternative in {@link PeopleCodeParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterExceptionSuperClass(PeopleCodeParser.ExceptionSuperClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExceptionSuperClass}
	 * labeled alternative in {@link PeopleCodeParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitExceptionSuperClass(PeopleCodeParser.ExceptionSuperClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AppClassSuperClass}
	 * labeled alternative in {@link PeopleCodeParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterAppClassSuperClass(PeopleCodeParser.AppClassSuperClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AppClassSuperClass}
	 * labeled alternative in {@link PeopleCodeParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitAppClassSuperClass(PeopleCodeParser.AppClassSuperClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleTypeSuperclass}
	 * labeled alternative in {@link PeopleCodeParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSuperclass(PeopleCodeParser.SimpleTypeSuperclassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleTypeSuperclass}
	 * labeled alternative in {@link PeopleCodeParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSuperclass(PeopleCodeParser.SimpleTypeSuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#classHeader}.
	 * @param ctx the parse tree
	 */
	void enterClassHeader(PeopleCodeParser.ClassHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#classHeader}.
	 * @param ctx the parse tree
	 */
	void exitClassHeader(PeopleCodeParser.ClassHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#nonPrivateHeader}.
	 * @param ctx the parse tree
	 */
	void enterNonPrivateHeader(PeopleCodeParser.NonPrivateHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#nonPrivateHeader}.
	 * @param ctx the parse tree
	 */
	void exitNonPrivateHeader(PeopleCodeParser.NonPrivateHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#publicHeader}.
	 * @param ctx the parse tree
	 */
	void enterPublicHeader(PeopleCodeParser.PublicHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#publicHeader}.
	 * @param ctx the parse tree
	 */
	void exitPublicHeader(PeopleCodeParser.PublicHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#protectedHeader}.
	 * @param ctx the parse tree
	 */
	void enterProtectedHeader(PeopleCodeParser.ProtectedHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#protectedHeader}.
	 * @param ctx the parse tree
	 */
	void exitProtectedHeader(PeopleCodeParser.ProtectedHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#privateHeader}.
	 * @param ctx the parse tree
	 */
	void enterPrivateHeader(PeopleCodeParser.PrivateHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#privateHeader}.
	 * @param ctx the parse tree
	 */
	void exitPrivateHeader(PeopleCodeParser.PrivateHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonPrivateMethodHeader}
	 * labeled alternative in {@link PeopleCodeParser#nonPrivateMember}.
	 * @param ctx the parse tree
	 */
	void enterNonPrivateMethodHeader(PeopleCodeParser.NonPrivateMethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonPrivateMethodHeader}
	 * labeled alternative in {@link PeopleCodeParser#nonPrivateMember}.
	 * @param ctx the parse tree
	 */
	void exitNonPrivateMethodHeader(PeopleCodeParser.NonPrivateMethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonPrivateProperty}
	 * labeled alternative in {@link PeopleCodeParser#nonPrivateMember}.
	 * @param ctx the parse tree
	 */
	void enterNonPrivateProperty(PeopleCodeParser.NonPrivatePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonPrivateProperty}
	 * labeled alternative in {@link PeopleCodeParser#nonPrivateMember}.
	 * @param ctx the parse tree
	 */
	void exitNonPrivateProperty(PeopleCodeParser.NonPrivatePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrivateMethodHeader}
	 * labeled alternative in {@link PeopleCodeParser#privateMember}.
	 * @param ctx the parse tree
	 */
	void enterPrivateMethodHeader(PeopleCodeParser.PrivateMethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrivateMethodHeader}
	 * labeled alternative in {@link PeopleCodeParser#privateMember}.
	 * @param ctx the parse tree
	 */
	void exitPrivateMethodHeader(PeopleCodeParser.PrivateMethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrivateProperty}
	 * labeled alternative in {@link PeopleCodeParser#privateMember}.
	 * @param ctx the parse tree
	 */
	void enterPrivateProperty(PeopleCodeParser.PrivatePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrivateProperty}
	 * labeled alternative in {@link PeopleCodeParser#privateMember}.
	 * @param ctx the parse tree
	 */
	void exitPrivateProperty(PeopleCodeParser.PrivatePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrivateConstant}
	 * labeled alternative in {@link PeopleCodeParser#privateMember}.
	 * @param ctx the parse tree
	 */
	void enterPrivateConstant(PeopleCodeParser.PrivateConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrivateConstant}
	 * labeled alternative in {@link PeopleCodeParser#privateMember}.
	 * @param ctx the parse tree
	 */
	void exitPrivateConstant(PeopleCodeParser.PrivateConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(PeopleCodeParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(PeopleCodeParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#methodArguments}.
	 * @param ctx the parse tree
	 */
	void enterMethodArguments(PeopleCodeParser.MethodArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#methodArguments}.
	 * @param ctx the parse tree
	 */
	void exitMethodArguments(PeopleCodeParser.MethodArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#methodArgument}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgument(PeopleCodeParser.MethodArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#methodArgument}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgument(PeopleCodeParser.MethodArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleBuiltInType}
	 * labeled alternative in {@link PeopleCodeParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleBuiltInType(PeopleCodeParser.SimpleBuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleBuiltInType}
	 * labeled alternative in {@link PeopleCodeParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleBuiltInType(PeopleCodeParser.SimpleBuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleGenericID}
	 * labeled alternative in {@link PeopleCodeParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleGenericID(PeopleCodeParser.SimpleGenericIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleGenericID}
	 * labeled alternative in {@link PeopleCodeParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleGenericID(PeopleCodeParser.SimpleGenericIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInType(PeopleCodeParser.BuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInType(PeopleCodeParser.BuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PeopleCodeParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PeopleCodeParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BaseExceptionType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 */
	void enterBaseExceptionType(PeopleCodeParser.BaseExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BaseExceptionType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 */
	void exitBaseExceptionType(PeopleCodeParser.BaseExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AppClassType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 */
	void enterAppClassType(PeopleCodeParser.AppClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AppClassType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 */
	void exitAppClassType(PeopleCodeParser.AppClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleTypeType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeType(PeopleCodeParser.SimpleTypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleTypeType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeType(PeopleCodeParser.SimpleTypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyGetSet}
	 * labeled alternative in {@link PeopleCodeParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetSet(PeopleCodeParser.PropertyGetSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyGetSet}
	 * labeled alternative in {@link PeopleCodeParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetSet(PeopleCodeParser.PropertyGetSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyDirect}
	 * labeled alternative in {@link PeopleCodeParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDirect(PeopleCodeParser.PropertyDirectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyDirect}
	 * labeled alternative in {@link PeopleCodeParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDirect(PeopleCodeParser.PropertyDirectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceDecl}
	 * labeled alternative in {@link PeopleCodeParser#instanceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInstanceDecl(PeopleCodeParser.InstanceDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceDecl}
	 * labeled alternative in {@link PeopleCodeParser#instanceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInstanceDecl(PeopleCodeParser.InstanceDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyInstanceDecl}
	 * labeled alternative in {@link PeopleCodeParser#instanceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyInstanceDecl(PeopleCodeParser.EmptyInstanceDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyInstanceDecl}
	 * labeled alternative in {@link PeopleCodeParser#instanceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyInstanceDecl(PeopleCodeParser.EmptyInstanceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(PeopleCodeParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(PeopleCodeParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PeopleCodeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PeopleCodeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#classExternalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassExternalDeclaration(PeopleCodeParser.ClassExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#classExternalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassExternalDeclaration(PeopleCodeParser.ClassExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#programPreambles}.
	 * @param ctx the parse tree
	 */
	void enterProgramPreambles(PeopleCodeParser.ProgramPreamblesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#programPreambles}.
	 * @param ctx the parse tree
	 */
	void exitProgramPreambles(PeopleCodeParser.ProgramPreamblesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#programPreamble}.
	 * @param ctx the parse tree
	 */
	void enterProgramPreamble(PeopleCodeParser.ProgramPreambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#programPreamble}.
	 * @param ctx the parse tree
	 */
	void exitProgramPreamble(PeopleCodeParser.ProgramPreambleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PeopleCodeFunctionDeclaration}
	 * labeled alternative in {@link PeopleCodeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPeopleCodeFunctionDeclaration(PeopleCodeParser.PeopleCodeFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PeopleCodeFunctionDeclaration}
	 * labeled alternative in {@link PeopleCodeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPeopleCodeFunctionDeclaration(PeopleCodeParser.PeopleCodeFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LibraryFunctionDeclaration}
	 * labeled alternative in {@link PeopleCodeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLibraryFunctionDeclaration(PeopleCodeParser.LibraryFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LibraryFunctionDeclaration}
	 * labeled alternative in {@link PeopleCodeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLibraryFunctionDeclaration(PeopleCodeParser.LibraryFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#functionDeclarationPCode}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationPCode(PeopleCodeParser.FunctionDeclarationPCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#functionDeclarationPCode}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationPCode(PeopleCodeParser.FunctionDeclarationPCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#recordField}.
	 * @param ctx the parse tree
	 */
	void enterRecordField(PeopleCodeParser.RecordFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#recordField}.
	 * @param ctx the parse tree
	 */
	void exitRecordField(PeopleCodeParser.RecordFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#functionDeclarationDLL}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationDLL(PeopleCodeParser.FunctionDeclarationDLLContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#functionDeclarationDLL}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationDLL(PeopleCodeParser.FunctionDeclarationDLLContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#dllArguments}.
	 * @param ctx the parse tree
	 */
	void enterDllArguments(PeopleCodeParser.DllArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#dllArguments}.
	 * @param ctx the parse tree
	 */
	void exitDllArguments(PeopleCodeParser.DllArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#dllArgument}.
	 * @param ctx the parse tree
	 */
	void enterDllArgument(PeopleCodeParser.DllArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#dllArgument}.
	 * @param ctx the parse tree
	 */
	void exitDllArgument(PeopleCodeParser.DllArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#dllReturnType}.
	 * @param ctx the parse tree
	 */
	void enterDllReturnType(PeopleCodeParser.DllReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#dllReturnType}.
	 * @param ctx the parse tree
	 */
	void exitDllReturnType(PeopleCodeParser.DllReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#nonLocalVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNonLocalVarDeclaration(PeopleCodeParser.NonLocalVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#nonLocalVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNonLocalVarDeclaration(PeopleCodeParser.NonLocalVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(PeopleCodeParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(PeopleCodeParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterMethodImplementation(PeopleCodeParser.MethodImplementationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitMethodImplementation(PeopleCodeParser.MethodImplementationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetterImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterGetterImplementation(PeopleCodeParser.GetterImplementationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetterImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitGetterImplementation(PeopleCodeParser.GetterImplementationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetterImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterSetterImplementation(PeopleCodeParser.SetterImplementationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetterImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitSetterImplementation(PeopleCodeParser.SetterImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(PeopleCodeParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(PeopleCodeParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(PeopleCodeParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(PeopleCodeParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(PeopleCodeParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(PeopleCodeParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PeopleCodeParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PeopleCodeParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(PeopleCodeParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(PeopleCodeParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperAssignmentStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSuperAssignmentStmt(PeopleCodeParser.SuperAssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperAssignmentStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSuperAssignmentStmt(PeopleCodeParser.SuperAssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalVarDeclarationStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDeclarationStmt(PeopleCodeParser.LocalVarDeclarationStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalVarDeclarationStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDeclarationStmt(PeopleCodeParser.LocalVarDeclarationStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PeopleCodeParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PeopleCodeParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PeopleCodeParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PeopleCodeParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(PeopleCodeParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(PeopleCodeParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStmt(PeopleCodeParser.RepeatStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStmt(PeopleCodeParser.RepeatStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EvaluateStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateStmt(PeopleCodeParser.EvaluateStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EvaluateStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateStmt(PeopleCodeParser.EvaluateStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryCatchBlockStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchBlockStmt(PeopleCodeParser.TryCatchBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryCatchBlockStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchBlockStmt(PeopleCodeParser.TryCatchBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExitStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(PeopleCodeParser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExitStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(PeopleCodeParser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(PeopleCodeParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(PeopleCodeParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(PeopleCodeParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(PeopleCodeParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ErrorStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterErrorStmt(PeopleCodeParser.ErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ErrorStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitErrorStmt(PeopleCodeParser.ErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WarningStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWarningStmt(PeopleCodeParser.WarningStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WarningStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWarningStmt(PeopleCodeParser.WarningStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PeopleCodeParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PeopleCodeParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThrowStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStmt(PeopleCodeParser.ThrowStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThrowStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStmt(PeopleCodeParser.ThrowStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(PeopleCodeParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(PeopleCodeParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(PeopleCodeParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(PeopleCodeParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#localVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDefinition(PeopleCodeParser.LocalVariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#localVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDefinition(PeopleCodeParser.LocalVariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#localVariableDeclAssignment}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclAssignment(PeopleCodeParser.LocalVariableDeclAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#localVariableDeclAssignment}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclAssignment(PeopleCodeParser.LocalVariableDeclAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PeopleCodeParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PeopleCodeParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PeopleCodeParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PeopleCodeParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PeopleCodeParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PeopleCodeParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(PeopleCodeParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(PeopleCodeParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#evaluateStatement}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateStatement(PeopleCodeParser.EvaluateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#evaluateStatement}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateStatement(PeopleCodeParser.EvaluateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#whenClauses}.
	 * @param ctx the parse tree
	 */
	void enterWhenClauses(PeopleCodeParser.WhenClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#whenClauses}.
	 * @param ctx the parse tree
	 */
	void exitWhenClauses(PeopleCodeParser.WhenClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(PeopleCodeParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(PeopleCodeParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#whenOther}.
	 * @param ctx the parse tree
	 */
	void enterWhenOther(PeopleCodeParser.WhenOtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#whenOther}.
	 * @param ctx the parse tree
	 */
	void exitWhenOther(PeopleCodeParser.WhenOtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(PeopleCodeParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(PeopleCodeParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#tryCatchBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchBlock(PeopleCodeParser.TryCatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#tryCatchBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchBlock(PeopleCodeParser.TryCatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void enterCatchClauses(PeopleCodeParser.CatchClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void exitCatchClauses(PeopleCodeParser.CatchClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(PeopleCodeParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(PeopleCodeParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(PeopleCodeParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(PeopleCodeParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassCastExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassCastExpr(PeopleCodeParser.ClassCastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassCastExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassCastExpr(PeopleCodeParser.ClassCastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatenationExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenationExpr(PeopleCodeParser.ConcatenationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatenationExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenationExpr(PeopleCodeParser.ConcatenationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringObjectReferenceExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringObjectReferenceExpr(PeopleCodeParser.StringObjectReferenceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringObjectReferenceExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringObjectReferenceExpr(PeopleCodeParser.StringObjectReferenceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayIndexExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexExpr(PeopleCodeParser.ArrayIndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayIndexExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexExpr(PeopleCodeParser.ArrayIndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubtrExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubtrExpr(PeopleCodeParser.AddSubtrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubtrExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubtrExpr(PeopleCodeParser.AddSubtrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(PeopleCodeParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(PeopleCodeParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtExpr(PeopleCodeParser.AtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtExpr(PeopleCodeParser.AtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOrExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndOrExpr(PeopleCodeParser.AndOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOrExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndOrExpr(PeopleCodeParser.AndOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImplicitSubindexExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterImplicitSubindexExpr(PeopleCodeParser.ImplicitSubindexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImplicitSubindexExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitImplicitSubindexExpr(PeopleCodeParser.ImplicitSubindexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotAccessExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDotAccessExpr(PeopleCodeParser.DotAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotAccessExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDotAccessExpr(PeopleCodeParser.DotAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(PeopleCodeParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(PeopleCodeParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExponentialExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponentialExpr(PeopleCodeParser.ExponentialExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExponentialExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponentialExpr(PeopleCodeParser.ExponentialExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(PeopleCodeParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(PeopleCodeParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectCreateExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreateExpr(PeopleCodeParser.ObjectCreateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectCreateExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreateExpr(PeopleCodeParser.ObjectCreateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(PeopleCodeParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(PeopleCodeParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(PeopleCodeParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(PeopleCodeParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpr(PeopleCodeParser.ParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpr(PeopleCodeParser.ParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(PeopleCodeParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(PeopleCodeParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MetadataExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMetadataExpr(PeopleCodeParser.MetadataExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MetadataExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMetadataExpr(PeopleCodeParser.MetadataExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegationExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegationExpr(PeopleCodeParser.NegationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegationExpr(PeopleCodeParser.NegationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#simpleFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionCall(PeopleCodeParser.SimpleFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#simpleFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionCall(PeopleCodeParser.SimpleFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#dotAccess}.
	 * @param ctx the parse tree
	 */
	void enterDotAccess(PeopleCodeParser.DotAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#dotAccess}.
	 * @param ctx the parse tree
	 */
	void exitDotAccess(PeopleCodeParser.DotAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#allowableFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAllowableFunctionName(PeopleCodeParser.AllowableFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#allowableFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAllowableFunctionName(PeopleCodeParser.AllowableFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#genericID}.
	 * @param ctx the parse tree
	 */
	void enterGenericID(PeopleCodeParser.GenericIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#genericID}.
	 * @param ctx the parse tree
	 */
	void exitGenericID(PeopleCodeParser.GenericIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentSuper}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdentSuper(PeopleCodeParser.IdentSuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentSuper}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdentSuper(PeopleCodeParser.IdentSuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentSystemVariable}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdentSystemVariable(PeopleCodeParser.IdentSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentSystemVariable}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdentSystemVariable(PeopleCodeParser.IdentSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentSystemConstant}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdentSystemConstant(PeopleCodeParser.IdentSystemConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentSystemConstant}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdentSystemConstant(PeopleCodeParser.IdentSystemConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentUserVariable}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdentUserVariable(PeopleCodeParser.IdentUserVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentUserVariable}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdentUserVariable(PeopleCodeParser.IdentUserVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentGenericID}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdentGenericID(PeopleCodeParser.IdentGenericIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentGenericID}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdentGenericID(PeopleCodeParser.IdentGenericIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(PeopleCodeParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(PeopleCodeParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#objectCreate}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreate(PeopleCodeParser.ObjectCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#objectCreate}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreate(PeopleCodeParser.ObjectCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(PeopleCodeParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(PeopleCodeParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitions(PeopleCodeParser.FunctionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitions(PeopleCodeParser.FunctionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PeopleCodeParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PeopleCodeParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(PeopleCodeParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(PeopleCodeParser.FunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgument(PeopleCodeParser.FunctionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgument(PeopleCodeParser.FunctionArgumentContext ctx);
}