// Generated from Ceson.g4 by ANTLR 4.7.2
package fr.obeo.emf.ceson.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CesonParser}.
 */
public interface CesonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CesonParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(CesonParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(CesonParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CesonParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(CesonParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(CesonParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ref}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterRef(CesonParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ref}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitRef(CesonParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(CesonParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(CesonParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterRealLiteral(CesonParser.RealLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitRealLiteral(CesonParser.RealLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(CesonParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(CesonParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(CesonParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(CesonParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(CesonParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DateLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(CesonParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterEnumLiteral(CesonParser.EnumLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitEnumLiteral(CesonParser.EnumLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(CesonParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(CesonParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(CesonParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link CesonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(CesonParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CesonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(CesonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(CesonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CesonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(CesonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(CesonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CesonParser#featureList}.
	 * @param ctx the parse tree
	 */
	void enterFeatureList(CesonParser.FeatureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#featureList}.
	 * @param ctx the parse tree
	 */
	void exitFeatureList(CesonParser.FeatureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CesonParser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(CesonParser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(CesonParser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CesonParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(CesonParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CesonParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(CesonParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Containment}
	 * labeled alternative in {@link CesonParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterContainment(CesonParser.ContainmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Containment}
	 * labeled alternative in {@link CesonParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitContainment(CesonParser.ContainmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Reference}
	 * labeled alternative in {@link CesonParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterReference(CesonParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Reference}
	 * labeled alternative in {@link CesonParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitReference(CesonParser.ReferenceContext ctx);
}