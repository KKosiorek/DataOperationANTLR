// Generated from DataOperation.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DataOperationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DataOperationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DataOperationParser#timeSpan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeSpan(DataOperationParser.TimeSpanContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataOperationParser#dataTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTime(DataOperationParser.DataTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataOperationParser#expressionResultData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionResultData(DataOperationParser.ExpressionResultDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataOperationParser#expressionResultDataRightERT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionResultDataRightERT(DataOperationParser.ExpressionResultDataRightERTContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataOperationParser#expressionResultTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionResultTime(DataOperationParser.ExpressionResultTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataOperationParser#expressionRoot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRoot(DataOperationParser.ExpressionRootContext ctx);
}