// Generated from C:/Users/hoooc/IdeaProjects/lab4_syntax_recognition/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(CmmParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(CmmParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#arrayDimensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDimensions(CmmParser.ArrayDimensionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(CmmParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(CmmParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(CmmParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(CmmParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CmmParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CmmParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CmmParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CmmParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CmmParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CmmParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(CmmParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(CmmParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CmmParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CmmParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(CmmParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(CmmParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CmmParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CmmParser.TypeContext ctx);
}