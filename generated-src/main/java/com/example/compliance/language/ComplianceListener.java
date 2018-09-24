// Generated from com/example/compliance/language/Compliance.g4 by ANTLR 4.7.1

package com.example.compliance.language;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ComplianceParser}.
 */
public interface ComplianceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(ComplianceParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(ComplianceParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(ComplianceParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(ComplianceParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_object}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_object(ComplianceParser.Compliance_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_object}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_object(ComplianceParser.Compliance_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_version}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_version(ComplianceParser.Compliance_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_version}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_version(ComplianceParser.Compliance_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#version_number_value}.
	 * @param ctx the parse tree
	 */
	void enterVersion_number_value(ComplianceParser.Version_number_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#version_number_value}.
	 * @param ctx the parse tree
	 */
	void exitVersion_number_value(ComplianceParser.Version_number_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_meta}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_meta(ComplianceParser.Compliance_metaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_meta}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_meta(ComplianceParser.Compliance_metaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_meta_name}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_meta_name(ComplianceParser.Compliance_meta_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_meta_name}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_meta_name(ComplianceParser.Compliance_meta_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_meta_description}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_meta_description(ComplianceParser.Compliance_meta_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_meta_description}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_meta_description(ComplianceParser.Compliance_meta_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_meta_type}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_meta_type(ComplianceParser.Compliance_meta_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_meta_type}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_meta_type(ComplianceParser.Compliance_meta_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_meta_name_value}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_meta_name_value(ComplianceParser.Compliance_meta_name_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_meta_name_value}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_meta_name_value(ComplianceParser.Compliance_meta_name_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_meta_description_value}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_meta_description_value(ComplianceParser.Compliance_meta_description_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_meta_description_value}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_meta_description_value(ComplianceParser.Compliance_meta_description_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_meta_type_value}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_meta_type_value(ComplianceParser.Compliance_meta_type_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_meta_type_value}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_meta_type_value(ComplianceParser.Compliance_meta_type_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_control}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_control(ComplianceParser.Compliance_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_control}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_control(ComplianceParser.Compliance_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_control_ctrl}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_control_ctrl(ComplianceParser.Compliance_control_ctrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_control_ctrl}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_control_ctrl(ComplianceParser.Compliance_control_ctrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_control_ctrl_value}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_control_ctrl_value(ComplianceParser.Compliance_control_ctrl_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_control_ctrl_value}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_control_ctrl_value(ComplianceParser.Compliance_control_ctrl_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_control_description}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_control_description(ComplianceParser.Compliance_control_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_control_description}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_control_description(ComplianceParser.Compliance_control_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplianceParser#compliance_control_description_value}.
	 * @param ctx the parse tree
	 */
	void enterCompliance_control_description_value(ComplianceParser.Compliance_control_description_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplianceParser#compliance_control_description_value}.
	 * @param ctx the parse tree
	 */
	void exitCompliance_control_description_value(ComplianceParser.Compliance_control_description_valueContext ctx);
}