package com.example.compliance.parser;

import com.example.compliance.language.ComplianceBaseListener;
import com.example.compliance.model.Compliance;
import com.example.compliance.language.ComplianceParser;

public class ComplianceListener extends ComplianceBaseListener {

    private Compliance.Builder builder = new Compliance.Builder();

    @Override
    public void enterError(ComplianceParser.ErrorContext ctx) {
        System.out.println("error ->" + ctx.getText());
        super.enterError(ctx);
    }

    @Override
    public void enterCompliance_control(ComplianceParser.Compliance_controlContext ctx) {
        builder.addComplianceRule(removeStartEndQuotes(ctx.compliance_control_ctrl().compliance_control_ctrl_value().getText()),
                removeStartEndQuotes(ctx.compliance_control_description().compliance_control_description_value().getText()));
        super.enterCompliance_control(ctx);
    }

    @Override
    public void enterVersion_number_value(ComplianceParser.Version_number_valueContext ctx) {
        builder.addVersion(ctx.getText());
        super.enterVersion_number_value(ctx);
    }


    @Override
    public void exitCompliance_meta_name_value(ComplianceParser.Compliance_meta_name_valueContext ctx) {
        builder.addMetaName(ctx.getText());
        super.exitCompliance_meta_name_value(ctx);
    }

    @Override
    public void enterCompliance_meta_description_value(ComplianceParser.Compliance_meta_description_valueContext ctx) {
        builder.addMetaDescription(ctx.getText());
        super.enterCompliance_meta_description_value(ctx);
    }

    @Override
    public void enterCompliance_meta_type_value(ComplianceParser.Compliance_meta_type_valueContext ctx) {
        builder.addMetaType(ctx.getText());
        super.enterCompliance_meta_type_value(ctx);
    }


    private String removeStartEndQuotes(final String text){
        return text.replaceAll("^\"|\"$", "");
    }


    public Compliance getComplianceStructure() {
        return builder.build();
    }
}
