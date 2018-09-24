package com.example.compliance.report;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {


    private final ControlResult[] controlResults;

    private ReportGenerator(Builder builder) {
        controlResults = builder.results.toArray(new ControlResult[]{});

    }

    public String generate() {
        final StringWriter writer = new StringWriter();
        for(ControlResult controlResult : controlResults){
            final String line = String.format("[%s] %s, %s", getSuccessValue(controlResult.isSuccess()), controlResult.getName(), controlResult.getDescription());
            writer.append(line);
            writer.append(System.lineSeparator());
        }
        return writer.toString();
    }


    private String getSuccessValue(final boolean success){
        return success ? "SUCCESS" : "FAILED";
    }


    public static class Builder {

        private List<ControlResult> results = new ArrayList<>();


        public Builder addTestCase(final String name, final String description, final BigDecimal time, final boolean success) {

            results.add(new ControlResult(name, description, time, success));
            return this;
        }


        public ReportGenerator build() {
            return new ReportGenerator(this);

        }
    }

    private static class ControlResult {
        private final String name, description;

        private final BigDecimal time;

        private final boolean success;


        private ControlResult(String name, String description,  BigDecimal time, boolean success) {
            this.name = name;
            this.description = description;
            this.time = time;
            this.success = success;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public BigDecimal getTime() {
            return time;
        }

        public boolean isSuccess() {
            return success;
        }
    }

}
