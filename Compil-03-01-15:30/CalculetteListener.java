// Generated from Calculette.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculetteParser}.
 */
public interface CalculetteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculetteParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculetteParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#forbloc}.
	 * @param ctx the parse tree
	 */
	void enterForbloc(CalculetteParser.ForblocContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#forbloc}.
	 * @param ctx the parse tree
	 */
	void exitForbloc(CalculetteParser.ForblocContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#branchement}.
	 * @param ctx the parse tree
	 */
	void enterBranchement(CalculetteParser.BranchementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#branchement}.
	 * @param ctx the parse tree
	 */
	void exitBranchement(CalculetteParser.BranchementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#whilebloc}.
	 * @param ctx the parse tree
	 */
	void enterWhilebloc(CalculetteParser.WhileblocContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#whilebloc}.
	 * @param ctx the parse tree
	 */
	void exitWhilebloc(CalculetteParser.WhileblocContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(CalculetteParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(CalculetteParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(CalculetteParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(CalculetteParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CalculetteParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CalculetteParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(CalculetteParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(CalculetteParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalculetteParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalculetteParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#entree}.
	 * @param ctx the parse tree
	 */
	void enterEntree(CalculetteParser.EntreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#entree}.
	 * @param ctx the parse tree
	 */
	void exitEntree(CalculetteParser.EntreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#sortie}.
	 * @param ctx the parse tree
	 */
	void enterSortie(CalculetteParser.SortieContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#sortie}.
	 * @param ctx the parse tree
	 */
	void exitSortie(CalculetteParser.SortieContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CalculetteParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CalculetteParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculetteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculetteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#conditionbasique}.
	 * @param ctx the parse tree
	 */
	void enterConditionbasique(CalculetteParser.ConditionbasiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#conditionbasique}.
	 * @param ctx the parse tree
	 */
	void exitConditionbasique(CalculetteParser.ConditionbasiqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#fonction}.
	 * @param ctx the parse tree
	 */
	void enterFonction(CalculetteParser.FonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#fonction}.
	 * @param ctx the parse tree
	 */
	void exitFonction(CalculetteParser.FonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculetteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(CalculetteParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculetteParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(CalculetteParser.FinInstructionContext ctx);
}