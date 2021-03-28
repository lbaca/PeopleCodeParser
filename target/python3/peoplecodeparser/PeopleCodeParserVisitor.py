from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PeopleCodeParser import PeopleCodeParser
else:
    from PeopleCodeParser import PeopleCodeParser

# This class defines a complete generic visitor for a parse tree produced by PeopleCodeParser.

class PeopleCodeParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PeopleCodeParser#AppClassProgram.
    def visitAppClassProgram(self, ctx:PeopleCodeParser.AppClassProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#InterfaceProgram.
    def visitInterfaceProgram(self, ctx:PeopleCodeParser.InterfaceProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#program.
    def visitProgram(self, ctx:PeopleCodeParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#importDeclaration.
    def visitImportDeclaration(self, ctx:PeopleCodeParser.ImportDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#appPackageAll.
    def visitAppPackageAll(self, ctx:PeopleCodeParser.AppPackageAllContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#appPackagePath.
    def visitAppPackagePath(self, ctx:PeopleCodeParser.AppPackagePathContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#appClassPath.
    def visitAppClassPath(self, ctx:PeopleCodeParser.AppClassPathContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ClassDeclarationExtension.
    def visitClassDeclarationExtension(self, ctx:PeopleCodeParser.ClassDeclarationExtensionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ClassDeclarationImplementation.
    def visitClassDeclarationImplementation(self, ctx:PeopleCodeParser.ClassDeclarationImplementationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ClassDeclarationPlain.
    def visitClassDeclarationPlain(self, ctx:PeopleCodeParser.ClassDeclarationPlainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#InterfaceDeclarationExtension.
    def visitInterfaceDeclarationExtension(self, ctx:PeopleCodeParser.InterfaceDeclarationExtensionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#InterfaceDeclarationPlain.
    def visitInterfaceDeclarationPlain(self, ctx:PeopleCodeParser.InterfaceDeclarationPlainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ExceptionSuperClass.
    def visitExceptionSuperClass(self, ctx:PeopleCodeParser.ExceptionSuperClassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#AppClassSuperClass.
    def visitAppClassSuperClass(self, ctx:PeopleCodeParser.AppClassSuperClassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#SimpleTypeSuperclass.
    def visitSimpleTypeSuperclass(self, ctx:PeopleCodeParser.SimpleTypeSuperclassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#classHeader.
    def visitClassHeader(self, ctx:PeopleCodeParser.ClassHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#nonPrivateHeader.
    def visitNonPrivateHeader(self, ctx:PeopleCodeParser.NonPrivateHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#publicHeader.
    def visitPublicHeader(self, ctx:PeopleCodeParser.PublicHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#protectedHeader.
    def visitProtectedHeader(self, ctx:PeopleCodeParser.ProtectedHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#privateHeader.
    def visitPrivateHeader(self, ctx:PeopleCodeParser.PrivateHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#NonPrivateMethodHeader.
    def visitNonPrivateMethodHeader(self, ctx:PeopleCodeParser.NonPrivateMethodHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#NonPrivateProperty.
    def visitNonPrivateProperty(self, ctx:PeopleCodeParser.NonPrivatePropertyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#PrivateMethodHeader.
    def visitPrivateMethodHeader(self, ctx:PeopleCodeParser.PrivateMethodHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#PrivateProperty.
    def visitPrivateProperty(self, ctx:PeopleCodeParser.PrivatePropertyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#PrivateConstant.
    def visitPrivateConstant(self, ctx:PeopleCodeParser.PrivateConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#methodHeader.
    def visitMethodHeader(self, ctx:PeopleCodeParser.MethodHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#methodArguments.
    def visitMethodArguments(self, ctx:PeopleCodeParser.MethodArgumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#methodArgument.
    def visitMethodArgument(self, ctx:PeopleCodeParser.MethodArgumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#SimpleBuiltInType.
    def visitSimpleBuiltInType(self, ctx:PeopleCodeParser.SimpleBuiltInTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#SimpleGenericID.
    def visitSimpleGenericID(self, ctx:PeopleCodeParser.SimpleGenericIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#builtInType.
    def visitBuiltInType(self, ctx:PeopleCodeParser.BuiltInTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ArrayType.
    def visitArrayType(self, ctx:PeopleCodeParser.ArrayTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#BaseExceptionType.
    def visitBaseExceptionType(self, ctx:PeopleCodeParser.BaseExceptionTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#AppClassType.
    def visitAppClassType(self, ctx:PeopleCodeParser.AppClassTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#SimpleTypeType.
    def visitSimpleTypeType(self, ctx:PeopleCodeParser.SimpleTypeTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#PropertyGetSet.
    def visitPropertyGetSet(self, ctx:PeopleCodeParser.PropertyGetSetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#PropertyDirect.
    def visitPropertyDirect(self, ctx:PeopleCodeParser.PropertyDirectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#InstanceDecl.
    def visitInstanceDecl(self, ctx:PeopleCodeParser.InstanceDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#EmptyInstanceDecl.
    def visitEmptyInstanceDecl(self, ctx:PeopleCodeParser.EmptyInstanceDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#constantDeclaration.
    def visitConstantDeclaration(self, ctx:PeopleCodeParser.ConstantDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#literal.
    def visitLiteral(self, ctx:PeopleCodeParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#classExternalDeclaration.
    def visitClassExternalDeclaration(self, ctx:PeopleCodeParser.ClassExternalDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#programPreambles.
    def visitProgramPreambles(self, ctx:PeopleCodeParser.ProgramPreamblesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#programPreamble.
    def visitProgramPreamble(self, ctx:PeopleCodeParser.ProgramPreambleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#PeopleCodeFunctionDeclaration.
    def visitPeopleCodeFunctionDeclaration(self, ctx:PeopleCodeParser.PeopleCodeFunctionDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#LibraryFunctionDeclaration.
    def visitLibraryFunctionDeclaration(self, ctx:PeopleCodeParser.LibraryFunctionDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#functionDeclarationPCode.
    def visitFunctionDeclarationPCode(self, ctx:PeopleCodeParser.FunctionDeclarationPCodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#recordField.
    def visitRecordField(self, ctx:PeopleCodeParser.RecordFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#functionDeclarationDLL.
    def visitFunctionDeclarationDLL(self, ctx:PeopleCodeParser.FunctionDeclarationDLLContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#dllArguments.
    def visitDllArguments(self, ctx:PeopleCodeParser.DllArgumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#dllArgument.
    def visitDllArgument(self, ctx:PeopleCodeParser.DllArgumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#dllReturnType.
    def visitDllReturnType(self, ctx:PeopleCodeParser.DllReturnTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#nonLocalVarDeclaration.
    def visitNonLocalVarDeclaration(self, ctx:PeopleCodeParser.NonLocalVarDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#classBody.
    def visitClassBody(self, ctx:PeopleCodeParser.ClassBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#MethodImplementation.
    def visitMethodImplementation(self, ctx:PeopleCodeParser.MethodImplementationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#GetterImplementation.
    def visitGetterImplementation(self, ctx:PeopleCodeParser.GetterImplementationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#SetterImplementation.
    def visitSetterImplementation(self, ctx:PeopleCodeParser.SetterImplementationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#method.
    def visitMethod(self, ctx:PeopleCodeParser.MethodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#getter.
    def visitGetter(self, ctx:PeopleCodeParser.GetterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#setter.
    def visitSetter(self, ctx:PeopleCodeParser.SetterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#statements.
    def visitStatements(self, ctx:PeopleCodeParser.StatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#statementBlock.
    def visitStatementBlock(self, ctx:PeopleCodeParser.StatementBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#SuperAssignmentStmt.
    def visitSuperAssignmentStmt(self, ctx:PeopleCodeParser.SuperAssignmentStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#LocalVarDeclarationStmt.
    def visitLocalVarDeclarationStmt(self, ctx:PeopleCodeParser.LocalVarDeclarationStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#IfStmt.
    def visitIfStmt(self, ctx:PeopleCodeParser.IfStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ForStmt.
    def visitForStmt(self, ctx:PeopleCodeParser.ForStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#WhileStmt.
    def visitWhileStmt(self, ctx:PeopleCodeParser.WhileStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#RepeatStmt.
    def visitRepeatStmt(self, ctx:PeopleCodeParser.RepeatStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#EvaluateStmt.
    def visitEvaluateStmt(self, ctx:PeopleCodeParser.EvaluateStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#TryCatchBlockStmt.
    def visitTryCatchBlockStmt(self, ctx:PeopleCodeParser.TryCatchBlockStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ExitStmt.
    def visitExitStmt(self, ctx:PeopleCodeParser.ExitStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#BreakStmt.
    def visitBreakStmt(self, ctx:PeopleCodeParser.BreakStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ContinueStmt.
    def visitContinueStmt(self, ctx:PeopleCodeParser.ContinueStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ErrorStmt.
    def visitErrorStmt(self, ctx:PeopleCodeParser.ErrorStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#WarningStmt.
    def visitWarningStmt(self, ctx:PeopleCodeParser.WarningStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ReturnStmt.
    def visitReturnStmt(self, ctx:PeopleCodeParser.ReturnStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ThrowStmt.
    def visitThrowStmt(self, ctx:PeopleCodeParser.ThrowStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ExpressionStmt.
    def visitExpressionStmt(self, ctx:PeopleCodeParser.ExpressionStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#localVariableDeclaration.
    def visitLocalVariableDeclaration(self, ctx:PeopleCodeParser.LocalVariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#localVariableDefinition.
    def visitLocalVariableDefinition(self, ctx:PeopleCodeParser.LocalVariableDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#localVariableDeclAssignment.
    def visitLocalVariableDeclAssignment(self, ctx:PeopleCodeParser.LocalVariableDeclAssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ifStatement.
    def visitIfStatement(self, ctx:PeopleCodeParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#forStatement.
    def visitForStatement(self, ctx:PeopleCodeParser.ForStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#whileStatement.
    def visitWhileStatement(self, ctx:PeopleCodeParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#repeatStatement.
    def visitRepeatStatement(self, ctx:PeopleCodeParser.RepeatStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#evaluateStatement.
    def visitEvaluateStatement(self, ctx:PeopleCodeParser.EvaluateStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#whenClauses.
    def visitWhenClauses(self, ctx:PeopleCodeParser.WhenClausesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#whenClause.
    def visitWhenClause(self, ctx:PeopleCodeParser.WhenClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#whenOther.
    def visitWhenOther(self, ctx:PeopleCodeParser.WhenOtherContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#comparisonOperator.
    def visitComparisonOperator(self, ctx:PeopleCodeParser.ComparisonOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#tryCatchBlock.
    def visitTryCatchBlock(self, ctx:PeopleCodeParser.TryCatchBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#catchClauses.
    def visitCatchClauses(self, ctx:PeopleCodeParser.CatchClausesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#catchClause.
    def visitCatchClause(self, ctx:PeopleCodeParser.CatchClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#MultDivExpr.
    def visitMultDivExpr(self, ctx:PeopleCodeParser.MultDivExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ClassCastExpr.
    def visitClassCastExpr(self, ctx:PeopleCodeParser.ClassCastExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ConcatenationExpr.
    def visitConcatenationExpr(self, ctx:PeopleCodeParser.ConcatenationExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#StringObjectReferenceExpr.
    def visitStringObjectReferenceExpr(self, ctx:PeopleCodeParser.StringObjectReferenceExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ArrayIndexExpr.
    def visitArrayIndexExpr(self, ctx:PeopleCodeParser.ArrayIndexExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#AddSubtrExpr.
    def visitAddSubtrExpr(self, ctx:PeopleCodeParser.AddSubtrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ComparisonExpr.
    def visitComparisonExpr(self, ctx:PeopleCodeParser.ComparisonExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#AtExpr.
    def visitAtExpr(self, ctx:PeopleCodeParser.AtExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#AndOrExpr.
    def visitAndOrExpr(self, ctx:PeopleCodeParser.AndOrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ImplicitSubindexExpr.
    def visitImplicitSubindexExpr(self, ctx:PeopleCodeParser.ImplicitSubindexExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#DotAccessExpr.
    def visitDotAccessExpr(self, ctx:PeopleCodeParser.DotAccessExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#FunctionCallExpr.
    def visitFunctionCallExpr(self, ctx:PeopleCodeParser.FunctionCallExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ExponentialExpr.
    def visitExponentialExpr(self, ctx:PeopleCodeParser.ExponentialExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#EqualityExpr.
    def visitEqualityExpr(self, ctx:PeopleCodeParser.EqualityExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ObjectCreateExpr.
    def visitObjectCreateExpr(self, ctx:PeopleCodeParser.ObjectCreateExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#IdentifierExpr.
    def visitIdentifierExpr(self, ctx:PeopleCodeParser.IdentifierExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#LiteralExpr.
    def visitLiteralExpr(self, ctx:PeopleCodeParser.LiteralExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#ParenthesizedExpr.
    def visitParenthesizedExpr(self, ctx:PeopleCodeParser.ParenthesizedExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#NotExpr.
    def visitNotExpr(self, ctx:PeopleCodeParser.NotExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#MetadataExpr.
    def visitMetadataExpr(self, ctx:PeopleCodeParser.MetadataExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#NegationExpr.
    def visitNegationExpr(self, ctx:PeopleCodeParser.NegationExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#simpleFunctionCall.
    def visitSimpleFunctionCall(self, ctx:PeopleCodeParser.SimpleFunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#dotAccess.
    def visitDotAccess(self, ctx:PeopleCodeParser.DotAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#allowableFunctionName.
    def visitAllowableFunctionName(self, ctx:PeopleCodeParser.AllowableFunctionNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#genericID.
    def visitGenericID(self, ctx:PeopleCodeParser.GenericIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#IdentSuper.
    def visitIdentSuper(self, ctx:PeopleCodeParser.IdentSuperContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#IdentSystemVariable.
    def visitIdentSystemVariable(self, ctx:PeopleCodeParser.IdentSystemVariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#IdentSystemConstant.
    def visitIdentSystemConstant(self, ctx:PeopleCodeParser.IdentSystemConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#IdentUserVariable.
    def visitIdentUserVariable(self, ctx:PeopleCodeParser.IdentUserVariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#IdentGenericID.
    def visitIdentGenericID(self, ctx:PeopleCodeParser.IdentGenericIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#expressionList.
    def visitExpressionList(self, ctx:PeopleCodeParser.ExpressionListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#objectCreate.
    def visitObjectCreate(self, ctx:PeopleCodeParser.ObjectCreateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#functionCallArguments.
    def visitFunctionCallArguments(self, ctx:PeopleCodeParser.FunctionCallArgumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#functionDefinitions.
    def visitFunctionDefinitions(self, ctx:PeopleCodeParser.FunctionDefinitionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#functionDefinition.
    def visitFunctionDefinition(self, ctx:PeopleCodeParser.FunctionDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#functionArguments.
    def visitFunctionArguments(self, ctx:PeopleCodeParser.FunctionArgumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PeopleCodeParser#functionArgument.
    def visitFunctionArgument(self, ctx:PeopleCodeParser.FunctionArgumentContext):
        return self.visitChildren(ctx)



del PeopleCodeParser