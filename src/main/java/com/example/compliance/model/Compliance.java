package com.example.compliance.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Compliance {

    private final ComplianceStructureMetaData complianceStructureMetaData;

    private final List<ComplianceStructureRule> rules;

    private Compliance(ComplianceStructureMetaData complianceStructureMetaData, final List<ComplianceStructureRule> rules) {
        this.complianceStructureMetaData = complianceStructureMetaData;
        this.rules = rules;
    }



    public ComplianceStructureMetaData getComplianceStructureMetaData() {
        return complianceStructureMetaData;
    }

    public List<ComplianceStructureRule> getRules() {
        return rules;
    }


    public static class ComplianceStructureMetaData {
        private final String name;

        private final String type;

        private final String description;

        public ComplianceStructureMetaData(String name, String type, String description) {
            this.name = name;
            this.type = type;
            this.description = description;
        }


        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public String getDescription() {
            return description;
        }
    }


    public static class ComplianceStructureRule {
        private final String control, description;

        ComplianceStructureRule(String control, String description) {
            this.control = control;
            this.description = description;
        }

        public String getControl() {
            return control;
        }

        public String getDescription() {
            return description;
        }
    }

    public static class Builder {

        private String version;

        private String metaName;

        private String metaDescription;

        private String metaType;

        private List<ComplianceStructureRule> rules = new ArrayList<>();

        public Builder addComplianceRule(final String control, final String description) {
            rules.add(new ComplianceStructureRule(control, description));
            return this;
        }


        public Builder addVersion(final String version) {
            this.version = version;
            return this;
        }


        public Builder addMetaName(final String name) {
            this.metaName = name;
            return this;
        }

        public Builder addMetaDescription(final String description) {
            this.metaDescription = description;
            return this;
        }

        public Builder addMetaType(final String type) {
            this.metaType = type;
            return this;
        }

        public Compliance build() {
            Objects.requireNonNull(this.version);
            Objects.requireNonNull(this.metaName);
            Objects.requireNonNull(this.metaDescription);
            Objects.requireNonNull(this.metaType);
            final ComplianceStructureMetaData complianceStructureMetaData = new ComplianceStructureMetaData(this.metaName, this.metaType, this.metaDescription);
            return new Compliance(complianceStructureMetaData, rules);
        }
    }
}
