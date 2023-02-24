// Generated from Calculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(CalculatorParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(CalculatorParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CalculatorParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CalculatorParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(CalculatorParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(CalculatorParser.FinInstructionContext ctx);
}