from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PeopleCodeParser import PeopleCodeParser
else:
    from PeopleCodeParser import PeopleCodeParser

# This class defines a complete listener for a parse tree produced by PeopleCodeParser.
class PeopleCodeParserListener(ParseTreeListener):

    # Enter a parse tree produced by PeopleCodeParser#AppClassProgram.
    def enterAppClassProgram(self, ctx:PeopleCodeParser.AppClassProgramContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#AppClassProgram.
    def exitAppClassProgram(self, ctx:PeopleCodeParser.AppClassProgramContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#InterfaceProgram.
    def enterInterfaceProgram(self, ctx:PeopleCodeParser.InterfaceProgramContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#InterfaceProgram.
    def exitInterfaceProgram(self, ctx:PeopleCodeParser.InterfaceProgramContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#program.
    def enterProgram(self, ctx:PeopleCodeParser.ProgramContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#program.
    def exitProgram(self, ctx:PeopleCodeParser.ProgramContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#importDeclaration.
    def enterImportDeclaration(self, ctx:PeopleCodeParser.ImportDeclarationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#importDeclaration.
    def exitImportDeclaration(self, ctx:PeopleCodeParser.ImportDeclarationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#appPackageAll.
    def enterAppPackageAll(self, ctx:PeopleCodeParser.AppPackageAllContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#appPackageAll.
    def exitAppPackageAll(self, ctx:PeopleCodeParser.AppPackageAllContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#appPackagePath.
    def enterAppPackagePath(self, ctx:PeopleCodeParser.AppPackagePathContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#appPackagePath.
    def exitAppPackagePath(self, ctx:PeopleCodeParser.AppPackagePathContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#appClassPath.
    def enterAppClassPath(self, ctx:PeopleCodeParser.AppClassPathContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#appClassPath.
    def exitAppClassPath(self, ctx:PeopleCodeParser.AppClassPathContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ClassDeclarationExtension.
    def enterClassDeclarationExtension(self, ctx:PeopleCodeParser.ClassDeclarationExtensionContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ClassDeclarationExtension.
    def exitClassDeclarationExtension(self, ctx:PeopleCodeParser.ClassDeclarationExtensionContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ClassDeclarationImplementation.
    def enterClassDeclarationImplementation(self, ctx:PeopleCodeParser.ClassDeclarationImplementationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ClassDeclarationImplementation.
    def exitClassDeclarationImplementation(self, ctx:PeopleCodeParser.ClassDeclarationImplementationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ClassDeclarationPlain.
    def enterClassDeclarationPlain(self, ctx:PeopleCodeParser.ClassDeclarationPlainContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ClassDeclarationPlain.
    def exitClassDeclarationPlain(self, ctx:PeopleCodeParser.ClassDeclarationPlainContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#InterfaceDeclarationExtension.
    def enterInterfaceDeclarationExtension(self, ctx:PeopleCodeParser.InterfaceDeclarationExtensionContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#InterfaceDeclarationExtension.
    def exitInterfaceDeclarationExtension(self, ctx:PeopleCodeParser.InterfaceDeclarationExtensionContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#InterfaceDeclarationPlain.
    def enterInterfaceDeclarationPlain(self, ctx:PeopleCodeParser.InterfaceDeclarationPlainContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#InterfaceDeclarationPlain.
    def exitInterfaceDeclarationPlain(self, ctx:PeopleCodeParser.InterfaceDeclarationPlainContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ExceptionSuperClass.
    def enterExceptionSuperClass(self, ctx:PeopleCodeParser.ExceptionSuperClassContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ExceptionSuperClass.
    def exitExceptionSuperClass(self, ctx:PeopleCodeParser.ExceptionSuperClassContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#AppClassSuperClass.
    def enterAppClassSuperClass(self, ctx:PeopleCodeParser.AppClassSuperClassContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#AppClassSuperClass.
    def exitAppClassSuperClass(self, ctx:PeopleCodeParser.AppClassSuperClassContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#SimpleTypeSuperclass.
    def enterSimpleTypeSuperclass(self, ctx:PeopleCodeParser.SimpleTypeSuperclassContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#SimpleTypeSuperclass.
    def exitSimpleTypeSuperclass(self, ctx:PeopleCodeParser.SimpleTypeSuperclassContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#classHeader.
    def enterClassHeader(self, ctx:PeopleCodeParser.ClassHeaderContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#classHeader.
    def exitClassHeader(self, ctx:PeopleCodeParser.ClassHeaderContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#nonPrivateHeader.
    def enterNonPrivateHeader(self, ctx:PeopleCodeParser.NonPrivateHeaderContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#nonPrivateHeader.
    def exitNonPrivateHeader(self, ctx:PeopleCodeParser.NonPrivateHeaderContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#publicHeader.
    def enterPublicHeader(self, ctx:PeopleCodeParser.PublicHeaderContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#publicHeader.
    def exitPublicHeader(self, ctx:PeopleCodeParser.PublicHeaderContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#protectedHeader.
    def enterProtectedHeader(self, ctx:PeopleCodeParser.ProtectedHeaderContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#protectedHeader.
    def exitProtectedHeader(self, ctx:PeopleCodeParser.ProtectedHeaderContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#privateHeader.
    def enterPrivateHeader(self, ctx:PeopleCodeParser.PrivateHeaderContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#privateHeader.
    def exitPrivateHeader(self, ctx:PeopleCodeParser.PrivateHeaderContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#NonPrivateMethodHeader.
    def enterNonPrivateMethodHeader(self, ctx:PeopleCodeParser.NonPrivateMethodHeaderContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#NonPrivateMethodHeader.
    def exitNonPrivateMethodHeader(self, ctx:PeopleCodeParser.NonPrivateMethodHeaderContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#NonPrivateProperty.
    def enterNonPrivateProperty(self, ctx:PeopleCodeParser.NonPrivatePropertyContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#NonPrivateProperty.
    def exitNonPrivateProperty(self, ctx:PeopleCodeParser.NonPrivatePropertyContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#PrivateMethodHeader.
    def enterPrivateMethodHeader(self, ctx:PeopleCodeParser.PrivateMethodHeaderContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#PrivateMethodHeader.
    def exitPrivateMethodHeader(self, ctx:PeopleCodeParser.PrivateMethodHeaderContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#PrivateProperty.
    def enterPrivateProperty(self, ctx:PeopleCodeParser.PrivatePropertyContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#PrivateProperty.
    def exitPrivateProperty(self, ctx:PeopleCodeParser.PrivatePropertyContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#PrivateConstant.
    def enterPrivateConstant(self, ctx:PeopleCodeParser.PrivateConstantContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#PrivateConstant.
    def exitPrivateConstant(self, ctx:PeopleCodeParser.PrivateConstantContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#methodHeader.
    def enterMethodHeader(self, ctx:PeopleCodeParser.MethodHeaderContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#methodHeader.
    def exitMethodHeader(self, ctx:PeopleCodeParser.MethodHeaderContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#methodArguments.
    def enterMethodArguments(self, ctx:PeopleCodeParser.MethodArgumentsContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#methodArguments.
    def exitMethodArguments(self, ctx:PeopleCodeParser.MethodArgumentsContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#methodArgument.
    def enterMethodArgument(self, ctx:PeopleCodeParser.MethodArgumentContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#methodArgument.
    def exitMethodArgument(self, ctx:PeopleCodeParser.MethodArgumentContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#SimpleBuiltInType.
    def enterSimpleBuiltInType(self, ctx:PeopleCodeParser.SimpleBuiltInTypeContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#SimpleBuiltInType.
    def exitSimpleBuiltInType(self, ctx:PeopleCodeParser.SimpleBuiltInTypeContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#SimpleGenericID.
    def enterSimpleGenericID(self, ctx:PeopleCodeParser.SimpleGenericIDContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#SimpleGenericID.
    def exitSimpleGenericID(self, ctx:PeopleCodeParser.SimpleGenericIDContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#builtInType.
    def enterBuiltInType(self, ctx:PeopleCodeParser.BuiltInTypeContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#builtInType.
    def exitBuiltInType(self, ctx:PeopleCodeParser.BuiltInTypeContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ArrayType.
    def enterArrayType(self, ctx:PeopleCodeParser.ArrayTypeContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ArrayType.
    def exitArrayType(self, ctx:PeopleCodeParser.ArrayTypeContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#BaseExceptionType.
    def enterBaseExceptionType(self, ctx:PeopleCodeParser.BaseExceptionTypeContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#BaseExceptionType.
    def exitBaseExceptionType(self, ctx:PeopleCodeParser.BaseExceptionTypeContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#AppClassType.
    def enterAppClassType(self, ctx:PeopleCodeParser.AppClassTypeContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#AppClassType.
    def exitAppClassType(self, ctx:PeopleCodeParser.AppClassTypeContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#SimpleTypeType.
    def enterSimpleTypeType(self, ctx:PeopleCodeParser.SimpleTypeTypeContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#SimpleTypeType.
    def exitSimpleTypeType(self, ctx:PeopleCodeParser.SimpleTypeTypeContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#PropertyGetSet.
    def enterPropertyGetSet(self, ctx:PeopleCodeParser.PropertyGetSetContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#PropertyGetSet.
    def exitPropertyGetSet(self, ctx:PeopleCodeParser.PropertyGetSetContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#PropertyDirect.
    def enterPropertyDirect(self, ctx:PeopleCodeParser.PropertyDirectContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#PropertyDirect.
    def exitPropertyDirect(self, ctx:PeopleCodeParser.PropertyDirectContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#InstanceDecl.
    def enterInstanceDecl(self, ctx:PeopleCodeParser.InstanceDeclContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#InstanceDecl.
    def exitInstanceDecl(self, ctx:PeopleCodeParser.InstanceDeclContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#EmptyInstanceDecl.
    def enterEmptyInstanceDecl(self, ctx:PeopleCodeParser.EmptyInstanceDeclContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#EmptyInstanceDecl.
    def exitEmptyInstanceDecl(self, ctx:PeopleCodeParser.EmptyInstanceDeclContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#constantDeclaration.
    def enterConstantDeclaration(self, ctx:PeopleCodeParser.ConstantDeclarationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#constantDeclaration.
    def exitConstantDeclaration(self, ctx:PeopleCodeParser.ConstantDeclarationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#literal.
    def enterLiteral(self, ctx:PeopleCodeParser.LiteralContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#literal.
    def exitLiteral(self, ctx:PeopleCodeParser.LiteralContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#classExternalDeclaration.
    def enterClassExternalDeclaration(self, ctx:PeopleCodeParser.ClassExternalDeclarationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#classExternalDeclaration.
    def exitClassExternalDeclaration(self, ctx:PeopleCodeParser.ClassExternalDeclarationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#programPreambles.
    def enterProgramPreambles(self, ctx:PeopleCodeParser.ProgramPreamblesContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#programPreambles.
    def exitProgramPreambles(self, ctx:PeopleCodeParser.ProgramPreamblesContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#programPreamble.
    def enterProgramPreamble(self, ctx:PeopleCodeParser.ProgramPreambleContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#programPreamble.
    def exitProgramPreamble(self, ctx:PeopleCodeParser.ProgramPreambleContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#PeopleCodeFunctionDeclaration.
    def enterPeopleCodeFunctionDeclaration(self, ctx:PeopleCodeParser.PeopleCodeFunctionDeclarationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#PeopleCodeFunctionDeclaration.
    def exitPeopleCodeFunctionDeclaration(self, ctx:PeopleCodeParser.PeopleCodeFunctionDeclarationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#LibraryFunctionDeclaration.
    def enterLibraryFunctionDeclaration(self, ctx:PeopleCodeParser.LibraryFunctionDeclarationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#LibraryFunctionDeclaration.
    def exitLibraryFunctionDeclaration(self, ctx:PeopleCodeParser.LibraryFunctionDeclarationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#functionDeclarationPCode.
    def enterFunctionDeclarationPCode(self, ctx:PeopleCodeParser.FunctionDeclarationPCodeContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#functionDeclarationPCode.
    def exitFunctionDeclarationPCode(self, ctx:PeopleCodeParser.FunctionDeclarationPCodeContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#recordField.
    def enterRecordField(self, ctx:PeopleCodeParser.RecordFieldContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#recordField.
    def exitRecordField(self, ctx:PeopleCodeParser.RecordFieldContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#functionDeclarationDLL.
    def enterFunctionDeclarationDLL(self, ctx:PeopleCodeParser.FunctionDeclarationDLLContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#functionDeclarationDLL.
    def exitFunctionDeclarationDLL(self, ctx:PeopleCodeParser.FunctionDeclarationDLLContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#dllArguments.
    def enterDllArguments(self, ctx:PeopleCodeParser.DllArgumentsContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#dllArguments.
    def exitDllArguments(self, ctx:PeopleCodeParser.DllArgumentsContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#dllArgument.
    def enterDllArgument(self, ctx:PeopleCodeParser.DllArgumentContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#dllArgument.
    def exitDllArgument(self, ctx:PeopleCodeParser.DllArgumentContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#dllReturnType.
    def enterDllReturnType(self, ctx:PeopleCodeParser.DllReturnTypeContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#dllReturnType.
    def exitDllReturnType(self, ctx:PeopleCodeParser.DllReturnTypeContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#nonLocalVarDeclaration.
    def enterNonLocalVarDeclaration(self, ctx:PeopleCodeParser.NonLocalVarDeclarationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#nonLocalVarDeclaration.
    def exitNonLocalVarDeclaration(self, ctx:PeopleCodeParser.NonLocalVarDeclarationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#classBody.
    def enterClassBody(self, ctx:PeopleCodeParser.ClassBodyContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#classBody.
    def exitClassBody(self, ctx:PeopleCodeParser.ClassBodyContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#MethodImplementation.
    def enterMethodImplementation(self, ctx:PeopleCodeParser.MethodImplementationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#MethodImplementation.
    def exitMethodImplementation(self, ctx:PeopleCodeParser.MethodImplementationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#GetterImplementation.
    def enterGetterImplementation(self, ctx:PeopleCodeParser.GetterImplementationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#GetterImplementation.
    def exitGetterImplementation(self, ctx:PeopleCodeParser.GetterImplementationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#SetterImplementation.
    def enterSetterImplementation(self, ctx:PeopleCodeParser.SetterImplementationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#SetterImplementation.
    def exitSetterImplementation(self, ctx:PeopleCodeParser.SetterImplementationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#method.
    def enterMethod(self, ctx:PeopleCodeParser.MethodContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#method.
    def exitMethod(self, ctx:PeopleCodeParser.MethodContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#getter.
    def enterGetter(self, ctx:PeopleCodeParser.GetterContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#getter.
    def exitGetter(self, ctx:PeopleCodeParser.GetterContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#setter.
    def enterSetter(self, ctx:PeopleCodeParser.SetterContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#setter.
    def exitSetter(self, ctx:PeopleCodeParser.SetterContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#statements.
    def enterStatements(self, ctx:PeopleCodeParser.StatementsContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#statements.
    def exitStatements(self, ctx:PeopleCodeParser.StatementsContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#statementBlock.
    def enterStatementBlock(self, ctx:PeopleCodeParser.StatementBlockContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#statementBlock.
    def exitStatementBlock(self, ctx:PeopleCodeParser.StatementBlockContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#SuperAssignmentStmt.
    def enterSuperAssignmentStmt(self, ctx:PeopleCodeParser.SuperAssignmentStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#SuperAssignmentStmt.
    def exitSuperAssignmentStmt(self, ctx:PeopleCodeParser.SuperAssignmentStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#LocalVarDeclarationStmt.
    def enterLocalVarDeclarationStmt(self, ctx:PeopleCodeParser.LocalVarDeclarationStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#LocalVarDeclarationStmt.
    def exitLocalVarDeclarationStmt(self, ctx:PeopleCodeParser.LocalVarDeclarationStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#IfStmt.
    def enterIfStmt(self, ctx:PeopleCodeParser.IfStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#IfStmt.
    def exitIfStmt(self, ctx:PeopleCodeParser.IfStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ForStmt.
    def enterForStmt(self, ctx:PeopleCodeParser.ForStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ForStmt.
    def exitForStmt(self, ctx:PeopleCodeParser.ForStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#WhileStmt.
    def enterWhileStmt(self, ctx:PeopleCodeParser.WhileStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#WhileStmt.
    def exitWhileStmt(self, ctx:PeopleCodeParser.WhileStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#RepeatStmt.
    def enterRepeatStmt(self, ctx:PeopleCodeParser.RepeatStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#RepeatStmt.
    def exitRepeatStmt(self, ctx:PeopleCodeParser.RepeatStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#EvaluateStmt.
    def enterEvaluateStmt(self, ctx:PeopleCodeParser.EvaluateStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#EvaluateStmt.
    def exitEvaluateStmt(self, ctx:PeopleCodeParser.EvaluateStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#TryCatchBlockStmt.
    def enterTryCatchBlockStmt(self, ctx:PeopleCodeParser.TryCatchBlockStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#TryCatchBlockStmt.
    def exitTryCatchBlockStmt(self, ctx:PeopleCodeParser.TryCatchBlockStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ExitStmt.
    def enterExitStmt(self, ctx:PeopleCodeParser.ExitStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ExitStmt.
    def exitExitStmt(self, ctx:PeopleCodeParser.ExitStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#BreakStmt.
    def enterBreakStmt(self, ctx:PeopleCodeParser.BreakStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#BreakStmt.
    def exitBreakStmt(self, ctx:PeopleCodeParser.BreakStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ContinueStmt.
    def enterContinueStmt(self, ctx:PeopleCodeParser.ContinueStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ContinueStmt.
    def exitContinueStmt(self, ctx:PeopleCodeParser.ContinueStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ErrorStmt.
    def enterErrorStmt(self, ctx:PeopleCodeParser.ErrorStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ErrorStmt.
    def exitErrorStmt(self, ctx:PeopleCodeParser.ErrorStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#WarningStmt.
    def enterWarningStmt(self, ctx:PeopleCodeParser.WarningStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#WarningStmt.
    def exitWarningStmt(self, ctx:PeopleCodeParser.WarningStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ReturnStmt.
    def enterReturnStmt(self, ctx:PeopleCodeParser.ReturnStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ReturnStmt.
    def exitReturnStmt(self, ctx:PeopleCodeParser.ReturnStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ThrowStmt.
    def enterThrowStmt(self, ctx:PeopleCodeParser.ThrowStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ThrowStmt.
    def exitThrowStmt(self, ctx:PeopleCodeParser.ThrowStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ExpressionStmt.
    def enterExpressionStmt(self, ctx:PeopleCodeParser.ExpressionStmtContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ExpressionStmt.
    def exitExpressionStmt(self, ctx:PeopleCodeParser.ExpressionStmtContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#localVariableDeclaration.
    def enterLocalVariableDeclaration(self, ctx:PeopleCodeParser.LocalVariableDeclarationContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#localVariableDeclaration.
    def exitLocalVariableDeclaration(self, ctx:PeopleCodeParser.LocalVariableDeclarationContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#localVariableDefinition.
    def enterLocalVariableDefinition(self, ctx:PeopleCodeParser.LocalVariableDefinitionContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#localVariableDefinition.
    def exitLocalVariableDefinition(self, ctx:PeopleCodeParser.LocalVariableDefinitionContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#localVariableDeclAssignment.
    def enterLocalVariableDeclAssignment(self, ctx:PeopleCodeParser.LocalVariableDeclAssignmentContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#localVariableDeclAssignment.
    def exitLocalVariableDeclAssignment(self, ctx:PeopleCodeParser.LocalVariableDeclAssignmentContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ifStatement.
    def enterIfStatement(self, ctx:PeopleCodeParser.IfStatementContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ifStatement.
    def exitIfStatement(self, ctx:PeopleCodeParser.IfStatementContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#forStatement.
    def enterForStatement(self, ctx:PeopleCodeParser.ForStatementContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#forStatement.
    def exitForStatement(self, ctx:PeopleCodeParser.ForStatementContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#whileStatement.
    def enterWhileStatement(self, ctx:PeopleCodeParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#whileStatement.
    def exitWhileStatement(self, ctx:PeopleCodeParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#repeatStatement.
    def enterRepeatStatement(self, ctx:PeopleCodeParser.RepeatStatementContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#repeatStatement.
    def exitRepeatStatement(self, ctx:PeopleCodeParser.RepeatStatementContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#evaluateStatement.
    def enterEvaluateStatement(self, ctx:PeopleCodeParser.EvaluateStatementContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#evaluateStatement.
    def exitEvaluateStatement(self, ctx:PeopleCodeParser.EvaluateStatementContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#whenClauses.
    def enterWhenClauses(self, ctx:PeopleCodeParser.WhenClausesContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#whenClauses.
    def exitWhenClauses(self, ctx:PeopleCodeParser.WhenClausesContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#whenClause.
    def enterWhenClause(self, ctx:PeopleCodeParser.WhenClauseContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#whenClause.
    def exitWhenClause(self, ctx:PeopleCodeParser.WhenClauseContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#whenOther.
    def enterWhenOther(self, ctx:PeopleCodeParser.WhenOtherContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#whenOther.
    def exitWhenOther(self, ctx:PeopleCodeParser.WhenOtherContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#comparisonOperator.
    def enterComparisonOperator(self, ctx:PeopleCodeParser.ComparisonOperatorContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#comparisonOperator.
    def exitComparisonOperator(self, ctx:PeopleCodeParser.ComparisonOperatorContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#tryCatchBlock.
    def enterTryCatchBlock(self, ctx:PeopleCodeParser.TryCatchBlockContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#tryCatchBlock.
    def exitTryCatchBlock(self, ctx:PeopleCodeParser.TryCatchBlockContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#catchClauses.
    def enterCatchClauses(self, ctx:PeopleCodeParser.CatchClausesContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#catchClauses.
    def exitCatchClauses(self, ctx:PeopleCodeParser.CatchClausesContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#catchClause.
    def enterCatchClause(self, ctx:PeopleCodeParser.CatchClauseContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#catchClause.
    def exitCatchClause(self, ctx:PeopleCodeParser.CatchClauseContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#MultDivExpr.
    def enterMultDivExpr(self, ctx:PeopleCodeParser.MultDivExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#MultDivExpr.
    def exitMultDivExpr(self, ctx:PeopleCodeParser.MultDivExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ClassCastExpr.
    def enterClassCastExpr(self, ctx:PeopleCodeParser.ClassCastExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ClassCastExpr.
    def exitClassCastExpr(self, ctx:PeopleCodeParser.ClassCastExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ConcatenationExpr.
    def enterConcatenationExpr(self, ctx:PeopleCodeParser.ConcatenationExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ConcatenationExpr.
    def exitConcatenationExpr(self, ctx:PeopleCodeParser.ConcatenationExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#StringObjectReferenceExpr.
    def enterStringObjectReferenceExpr(self, ctx:PeopleCodeParser.StringObjectReferenceExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#StringObjectReferenceExpr.
    def exitStringObjectReferenceExpr(self, ctx:PeopleCodeParser.StringObjectReferenceExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ArrayIndexExpr.
    def enterArrayIndexExpr(self, ctx:PeopleCodeParser.ArrayIndexExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ArrayIndexExpr.
    def exitArrayIndexExpr(self, ctx:PeopleCodeParser.ArrayIndexExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#AddSubtrExpr.
    def enterAddSubtrExpr(self, ctx:PeopleCodeParser.AddSubtrExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#AddSubtrExpr.
    def exitAddSubtrExpr(self, ctx:PeopleCodeParser.AddSubtrExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ComparisonExpr.
    def enterComparisonExpr(self, ctx:PeopleCodeParser.ComparisonExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ComparisonExpr.
    def exitComparisonExpr(self, ctx:PeopleCodeParser.ComparisonExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#AtExpr.
    def enterAtExpr(self, ctx:PeopleCodeParser.AtExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#AtExpr.
    def exitAtExpr(self, ctx:PeopleCodeParser.AtExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#AndOrExpr.
    def enterAndOrExpr(self, ctx:PeopleCodeParser.AndOrExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#AndOrExpr.
    def exitAndOrExpr(self, ctx:PeopleCodeParser.AndOrExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ImplicitSubindexExpr.
    def enterImplicitSubindexExpr(self, ctx:PeopleCodeParser.ImplicitSubindexExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ImplicitSubindexExpr.
    def exitImplicitSubindexExpr(self, ctx:PeopleCodeParser.ImplicitSubindexExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#DotAccessExpr.
    def enterDotAccessExpr(self, ctx:PeopleCodeParser.DotAccessExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#DotAccessExpr.
    def exitDotAccessExpr(self, ctx:PeopleCodeParser.DotAccessExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#FunctionCallExpr.
    def enterFunctionCallExpr(self, ctx:PeopleCodeParser.FunctionCallExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#FunctionCallExpr.
    def exitFunctionCallExpr(self, ctx:PeopleCodeParser.FunctionCallExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ExponentialExpr.
    def enterExponentialExpr(self, ctx:PeopleCodeParser.ExponentialExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ExponentialExpr.
    def exitExponentialExpr(self, ctx:PeopleCodeParser.ExponentialExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#EqualityExpr.
    def enterEqualityExpr(self, ctx:PeopleCodeParser.EqualityExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#EqualityExpr.
    def exitEqualityExpr(self, ctx:PeopleCodeParser.EqualityExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ObjectCreateExpr.
    def enterObjectCreateExpr(self, ctx:PeopleCodeParser.ObjectCreateExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ObjectCreateExpr.
    def exitObjectCreateExpr(self, ctx:PeopleCodeParser.ObjectCreateExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#IdentifierExpr.
    def enterIdentifierExpr(self, ctx:PeopleCodeParser.IdentifierExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#IdentifierExpr.
    def exitIdentifierExpr(self, ctx:PeopleCodeParser.IdentifierExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#LiteralExpr.
    def enterLiteralExpr(self, ctx:PeopleCodeParser.LiteralExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#LiteralExpr.
    def exitLiteralExpr(self, ctx:PeopleCodeParser.LiteralExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#ParenthesizedExpr.
    def enterParenthesizedExpr(self, ctx:PeopleCodeParser.ParenthesizedExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#ParenthesizedExpr.
    def exitParenthesizedExpr(self, ctx:PeopleCodeParser.ParenthesizedExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#NotExpr.
    def enterNotExpr(self, ctx:PeopleCodeParser.NotExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#NotExpr.
    def exitNotExpr(self, ctx:PeopleCodeParser.NotExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#MetadataExpr.
    def enterMetadataExpr(self, ctx:PeopleCodeParser.MetadataExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#MetadataExpr.
    def exitMetadataExpr(self, ctx:PeopleCodeParser.MetadataExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#NegationExpr.
    def enterNegationExpr(self, ctx:PeopleCodeParser.NegationExprContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#NegationExpr.
    def exitNegationExpr(self, ctx:PeopleCodeParser.NegationExprContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#simpleFunctionCall.
    def enterSimpleFunctionCall(self, ctx:PeopleCodeParser.SimpleFunctionCallContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#simpleFunctionCall.
    def exitSimpleFunctionCall(self, ctx:PeopleCodeParser.SimpleFunctionCallContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#dotAccess.
    def enterDotAccess(self, ctx:PeopleCodeParser.DotAccessContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#dotAccess.
    def exitDotAccess(self, ctx:PeopleCodeParser.DotAccessContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#allowableFunctionName.
    def enterAllowableFunctionName(self, ctx:PeopleCodeParser.AllowableFunctionNameContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#allowableFunctionName.
    def exitAllowableFunctionName(self, ctx:PeopleCodeParser.AllowableFunctionNameContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#genericID.
    def enterGenericID(self, ctx:PeopleCodeParser.GenericIDContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#genericID.
    def exitGenericID(self, ctx:PeopleCodeParser.GenericIDContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#IdentSuper.
    def enterIdentSuper(self, ctx:PeopleCodeParser.IdentSuperContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#IdentSuper.
    def exitIdentSuper(self, ctx:PeopleCodeParser.IdentSuperContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#IdentSystemVariable.
    def enterIdentSystemVariable(self, ctx:PeopleCodeParser.IdentSystemVariableContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#IdentSystemVariable.
    def exitIdentSystemVariable(self, ctx:PeopleCodeParser.IdentSystemVariableContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#IdentSystemConstant.
    def enterIdentSystemConstant(self, ctx:PeopleCodeParser.IdentSystemConstantContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#IdentSystemConstant.
    def exitIdentSystemConstant(self, ctx:PeopleCodeParser.IdentSystemConstantContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#IdentUserVariable.
    def enterIdentUserVariable(self, ctx:PeopleCodeParser.IdentUserVariableContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#IdentUserVariable.
    def exitIdentUserVariable(self, ctx:PeopleCodeParser.IdentUserVariableContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#IdentGenericID.
    def enterIdentGenericID(self, ctx:PeopleCodeParser.IdentGenericIDContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#IdentGenericID.
    def exitIdentGenericID(self, ctx:PeopleCodeParser.IdentGenericIDContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#expressionList.
    def enterExpressionList(self, ctx:PeopleCodeParser.ExpressionListContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#expressionList.
    def exitExpressionList(self, ctx:PeopleCodeParser.ExpressionListContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#objectCreate.
    def enterObjectCreate(self, ctx:PeopleCodeParser.ObjectCreateContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#objectCreate.
    def exitObjectCreate(self, ctx:PeopleCodeParser.ObjectCreateContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#functionCallArguments.
    def enterFunctionCallArguments(self, ctx:PeopleCodeParser.FunctionCallArgumentsContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#functionCallArguments.
    def exitFunctionCallArguments(self, ctx:PeopleCodeParser.FunctionCallArgumentsContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#functionDefinitions.
    def enterFunctionDefinitions(self, ctx:PeopleCodeParser.FunctionDefinitionsContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#functionDefinitions.
    def exitFunctionDefinitions(self, ctx:PeopleCodeParser.FunctionDefinitionsContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#functionDefinition.
    def enterFunctionDefinition(self, ctx:PeopleCodeParser.FunctionDefinitionContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#functionDefinition.
    def exitFunctionDefinition(self, ctx:PeopleCodeParser.FunctionDefinitionContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#functionArguments.
    def enterFunctionArguments(self, ctx:PeopleCodeParser.FunctionArgumentsContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#functionArguments.
    def exitFunctionArguments(self, ctx:PeopleCodeParser.FunctionArgumentsContext):
        pass


    # Enter a parse tree produced by PeopleCodeParser#functionArgument.
    def enterFunctionArgument(self, ctx:PeopleCodeParser.FunctionArgumentContext):
        pass

    # Exit a parse tree produced by PeopleCodeParser#functionArgument.
    def exitFunctionArgument(self, ctx:PeopleCodeParser.FunctionArgumentContext):
        pass



del PeopleCodeParser