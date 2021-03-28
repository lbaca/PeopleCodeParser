package com.leandrobaca.peoplesoft.peoplecode.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PeopleCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PeopleCodeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code AppClassProgram}
	 * labeled alternative in {@link PeopleCodeParser#appClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppClassProgram(PeopleCodeParser.AppClassProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceProgram}
	 * labeled alternative in {@link PeopleCodeParser#appClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceProgram(PeopleCodeParser.InterfaceProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PeopleCodeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(PeopleCodeParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#appPackageAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppPackageAll(PeopleCodeParser.AppPackageAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#appPackagePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppPackagePath(PeopleCodeParser.AppPackagePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#appClassPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppClassPath(PeopleCodeParser.AppClassPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationExtension}
	 * labeled alternative in {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationExtension(PeopleCodeParser.ClassDeclarationExtensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationImplementation(PeopleCodeParser.ClassDeclarationImplementationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationPlain}
	 * labeled alternative in {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationPlain(PeopleCodeParser.ClassDeclarationPlainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDeclarationExtension}
	 * labeled alternative in {@link PeopleCodeParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclarationExtension(PeopleCodeParser.InterfaceDeclarationExtensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDeclarationPlain}
	 * labeled alternative in {@link PeopleCodeParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclarationPlain(PeopleCodeParser.InterfaceDeclarationPlainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExceptionSuperClass}
	 * labeled alternative in {@link PeopleCodeParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionSuperClass(PeopleCodeParser.ExceptionSuperClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AppClassSuperClass}
	 * labeled alternative in {@link PeopleCodeParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppClassSuperClass(PeopleCodeParser.AppClassSuperClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleTypeSuperclass}
	 * labeled alternative in {@link PeopleCodeParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSuperclass(PeopleCodeParser.SimpleTypeSuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#classHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeader(PeopleCodeParser.ClassHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#nonPrivateHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonPrivateHeader(PeopleCodeParser.NonPrivateHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#publicHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicHeader(PeopleCodeParser.PublicHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#protectedHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtectedHeader(PeopleCodeParser.ProtectedHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#privateHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateHeader(PeopleCodeParser.PrivateHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonPrivateMethodHeader}
	 * labeled alternative in {@link PeopleCodeParser#nonPrivateMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonPrivateMethodHeader(PeopleCodeParser.NonPrivateMethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonPrivateProperty}
	 * labeled alternative in {@link PeopleCodeParser#nonPrivateMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonPrivateProperty(PeopleCodeParser.NonPrivatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrivateMethodHeader}
	 * labeled alternative in {@link PeopleCodeParser#privateMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateMethodHeader(PeopleCodeParser.PrivateMethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrivateProperty}
	 * labeled alternative in {@link PeopleCodeParser#privateMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateProperty(PeopleCodeParser.PrivatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrivateConstant}
	 * labeled alternative in {@link PeopleCodeParser#privateMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateConstant(PeopleCodeParser.PrivateConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(PeopleCodeParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#methodArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArguments(PeopleCodeParser.MethodArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#methodArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArgument(PeopleCodeParser.MethodArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleBuiltInType}
	 * labeled alternative in {@link PeopleCodeParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleBuiltInType(PeopleCodeParser.SimpleBuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleGenericID}
	 * labeled alternative in {@link PeopleCodeParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleGenericID(PeopleCodeParser.SimpleGenericIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#builtInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInType(PeopleCodeParser.BuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PeopleCodeParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BaseExceptionType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExceptionType(PeopleCodeParser.BaseExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AppClassType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppClassType(PeopleCodeParser.AppClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleTypeType}
	 * labeled alternative in {@link PeopleCodeParser#typeT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeType(PeopleCodeParser.SimpleTypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyGetSet}
	 * labeled alternative in {@link PeopleCodeParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyGetSet(PeopleCodeParser.PropertyGetSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyDirect}
	 * labeled alternative in {@link PeopleCodeParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDirect(PeopleCodeParser.PropertyDirectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstanceDecl}
	 * labeled alternative in {@link PeopleCodeParser#instanceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceDecl(PeopleCodeParser.InstanceDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyInstanceDecl}
	 * labeled alternative in {@link PeopleCodeParser#instanceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyInstanceDecl(PeopleCodeParser.EmptyInstanceDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(PeopleCodeParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PeopleCodeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#classExternalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExternalDeclaration(PeopleCodeParser.ClassExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#programPreambles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramPreambles(PeopleCodeParser.ProgramPreamblesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#programPreamble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramPreamble(PeopleCodeParser.ProgramPreambleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PeopleCodeFunctionDeclaration}
	 * labeled alternative in {@link PeopleCodeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeopleCodeFunctionDeclaration(PeopleCodeParser.PeopleCodeFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LibraryFunctionDeclaration}
	 * labeled alternative in {@link PeopleCodeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryFunctionDeclaration(PeopleCodeParser.LibraryFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#functionDeclarationPCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationPCode(PeopleCodeParser.FunctionDeclarationPCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#recordField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordField(PeopleCodeParser.RecordFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#functionDeclarationDLL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationDLL(PeopleCodeParser.FunctionDeclarationDLLContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#dllArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDllArguments(PeopleCodeParser.DllArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#dllArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDllArgument(PeopleCodeParser.DllArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#dllReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDllReturnType(PeopleCodeParser.DllReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#nonLocalVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonLocalVarDeclaration(PeopleCodeParser.NonLocalVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(PeopleCodeParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodImplementation(PeopleCodeParser.MethodImplementationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetterImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetterImplementation(PeopleCodeParser.GetterImplementationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetterImplementation}
	 * labeled alternative in {@link PeopleCodeParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetterImplementation(PeopleCodeParser.SetterImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(PeopleCodeParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(PeopleCodeParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(PeopleCodeParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PeopleCodeParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(PeopleCodeParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuperAssignmentStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperAssignmentStmt(PeopleCodeParser.SuperAssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalVarDeclarationStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarDeclarationStmt(PeopleCodeParser.LocalVarDeclarationStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(PeopleCodeParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(PeopleCodeParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(PeopleCodeParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStmt(PeopleCodeParser.RepeatStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EvaluateStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateStmt(PeopleCodeParser.EvaluateStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryCatchBlockStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchBlockStmt(PeopleCodeParser.TryCatchBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExitStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStmt(PeopleCodeParser.ExitStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(PeopleCodeParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(PeopleCodeParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ErrorStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorStmt(PeopleCodeParser.ErrorStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WarningStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWarningStmt(PeopleCodeParser.WarningStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(PeopleCodeParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThrowStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStmt(PeopleCodeParser.ThrowStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link PeopleCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(PeopleCodeParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(PeopleCodeParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#localVariableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDefinition(PeopleCodeParser.LocalVariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#localVariableDeclAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclAssignment(PeopleCodeParser.LocalVariableDeclAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PeopleCodeParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PeopleCodeParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PeopleCodeParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(PeopleCodeParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#evaluateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluateStatement(PeopleCodeParser.EvaluateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#whenClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClauses(PeopleCodeParser.WhenClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(PeopleCodeParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#whenOther}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenOther(PeopleCodeParser.WhenOtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(PeopleCodeParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#tryCatchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchBlock(PeopleCodeParser.TryCatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#catchClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClauses(PeopleCodeParser.CatchClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(PeopleCodeParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDivExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivExpr(PeopleCodeParser.MultDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassCastExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCastExpr(PeopleCodeParser.ClassCastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatenationExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenationExpr(PeopleCodeParser.ConcatenationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringObjectReferenceExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringObjectReferenceExpr(PeopleCodeParser.StringObjectReferenceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayIndexExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexExpr(PeopleCodeParser.ArrayIndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubtrExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubtrExpr(PeopleCodeParser.AddSubtrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(PeopleCodeParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtExpr(PeopleCodeParser.AtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOrExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrExpr(PeopleCodeParser.AndOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImplicitSubindexExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitSubindexExpr(PeopleCodeParser.ImplicitSubindexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotAccessExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotAccessExpr(PeopleCodeParser.DotAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(PeopleCodeParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExponentialExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentialExpr(PeopleCodeParser.ExponentialExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(PeopleCodeParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectCreateExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCreateExpr(PeopleCodeParser.ObjectCreateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(PeopleCodeParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(PeopleCodeParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(PeopleCodeParser.ParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PeopleCodeParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MetadataExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataExpr(PeopleCodeParser.MetadataExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegationExpr}
	 * labeled alternative in {@link PeopleCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationExpr(PeopleCodeParser.NegationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#simpleFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFunctionCall(PeopleCodeParser.SimpleFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#dotAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotAccess(PeopleCodeParser.DotAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#allowableFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllowableFunctionName(PeopleCodeParser.AllowableFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#genericID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericID(PeopleCodeParser.GenericIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentSuper}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentSuper(PeopleCodeParser.IdentSuperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentSystemVariable}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentSystemVariable(PeopleCodeParser.IdentSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentSystemConstant}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentSystemConstant(PeopleCodeParser.IdentSystemConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentUserVariable}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentUserVariable(PeopleCodeParser.IdentUserVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentGenericID}
	 * labeled alternative in {@link PeopleCodeParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentGenericID(PeopleCodeParser.IdentGenericIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(PeopleCodeParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#objectCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCreate(PeopleCodeParser.ObjectCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(PeopleCodeParser.FunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#functionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitions(PeopleCodeParser.FunctionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(PeopleCodeParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(PeopleCodeParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PeopleCodeParser#functionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgument(PeopleCodeParser.FunctionArgumentContext ctx);
}