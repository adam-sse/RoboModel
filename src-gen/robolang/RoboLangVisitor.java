// Generated from RoboLang.g4 by ANTLR 4.4
package robolang;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RoboLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RoboLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#robot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRobot(@NotNull RoboLangParser.RobotContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#motor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMotor(@NotNull RoboLangParser.MotorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull RoboLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull RoboLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#setup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetup(@NotNull RoboLangParser.SetupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#sensor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensor(@NotNull RoboLangParser.SensorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull RoboLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull RoboLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#turn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurn(@NotNull RoboLangParser.TurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#drive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrive(@NotNull RoboLangParser.DriveContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(@NotNull RoboLangParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(@NotNull RoboLangParser.CommandContext ctx);
}