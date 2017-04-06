// Generated from DataOperation.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataOperationParser}.
 */
public interface DataOperationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataOperationParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(DataOperationParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataOperationParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(DataOperationParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataOperationParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(DataOperationParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataOperationParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(DataOperationParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataOperationParser#dataTime}.
	 * @param ctx the parse tree
	 */
	void enterDataTime(DataOperationParser.DataTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataOperationParser#dataTime}.
	 * @param ctx the parse tree
	 */
	void exitDataTime(DataOperationParser.DataTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataOperationParser#expressionResultData}.
	 * @param ctx the parse tree
	 */
	void enterExpressionResultData(DataOperationParser.ExpressionResultDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataOperationParser#expressionResultData}.
	 * @param ctx the parse tree
	 */
	void exitExpressionResultData(DataOperationParser.ExpressionResultDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataOperationParser#expressionResultTime}.
	 * @param ctx the parse tree
	 */
	void enterExpressionResultTime(DataOperationParser.ExpressionResultTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataOperationParser#expressionResultTime}.
	 * @param ctx the parse tree
	 */
	void exitExpressionResultTime(DataOperationParser.ExpressionResultTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataOperationParser#expressionRoot}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRoot(DataOperationParser.ExpressionRootContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataOperationParser#expressionRoot}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRoot(DataOperationParser.ExpressionRootContext ctx);
}