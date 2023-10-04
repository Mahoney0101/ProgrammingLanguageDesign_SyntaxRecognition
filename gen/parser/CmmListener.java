// Generated from C:/Users/hoooc/IdeaProjects/lab4_syntax_recognition/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(CmmParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(CmmParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#arrayVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayVarDecl(CmmParser.ArrayVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#arrayVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayVarDecl(CmmParser.ArrayVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(CmmParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(CmmParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#arrayDimensions}.
	 * @param ctx the parse tree
	 */
	void enterArrayDimensions(CmmParser.ArrayDimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#arrayDimensions}.
	 * @param ctx the parse tree
	 */
	void exitArrayDimensions(CmmParser.ArrayDimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CmmParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CmmParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(CmmParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(CmmParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CmmParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CmmParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(CmmParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(CmmParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CmmParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CmmParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CmmParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CmmParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CmmParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CmmParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CmmParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CmmParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CmmParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CmmParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CmmParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CmmParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(CmmParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(CmmParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(CmmParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(CmmParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CmmParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CmmParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CmmParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CmmParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CmmParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CmmParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(CmmParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(CmmParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CmmParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CmmParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CmmParser.TypeContext ctx);
}