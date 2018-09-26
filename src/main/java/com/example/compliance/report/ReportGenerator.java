package com.example.compliance.report;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.fusesource.jansi.Ansi.ansi;

public class ReportGenerator {


    private final ControlResult[] controlResults;

    private ReportGenerator(Builder builder) {
        controlResults = builder.results.toArray(new ControlResult[]{});

    }

    public String generate(boolean withAnsi) {
        final StringWriter writer = new StringWriter();
        for (ControlResult controlResult : controlResults) {
            final String line = String.format("[%s] %s, %s", getSuccessValue(controlResult.getRunStatus(), withAnsi), controlResult.getName(), controlResult.getDescription());
            writer.append(line);
            writer.append(System.lineSeparator());
            writer.append(System.lineSeparator());
        }
        return writer.toString();
    }

    private String getSuccessValue(final RunStatus runStatus, final boolean withAnsi) {
        String result = null;
        switch (runStatus) {
            case SUCCESS:
                result = withAnsi ? ansi().fgGreen().a("SUCCESS").reset().toString() : "SUCCESS";
                break;
            case MISSING:
                result = withAnsi ? ansi().fgBrightYellow().a("MISSING").reset().toString() : "MISSING";
                break;
            default:
                result = withAnsi ? ansi().fgRed().a("ERROR").reset().toString() : "ERROR";
                break;
        }
        return result;
    }


    public static class Builder {

        private List<ControlResult> results = new ArrayList<>();


        public Builder addTestCase(final String name, final String description, final BigDecimal time, final RunStatus runStatus, final Optional<String> error) {

            results.add(new ControlResult(name, description, time, runStatus, error));
            return this;
        }


        public ReportGenerator build() {
            return new ReportGenerator(this);

        }
    }

    private static class ControlResult {
        private final String name, description;

        private final BigDecimal time;

        private final RunStatus runStatus;

        private Optional<String> error;


        private ControlResult(String name, String description, BigDecimal time, RunStatus runStatus, Optional<String> error) {
            this.name = name;
            this.description = description;
            this.time = time;
            this.runStatus = runStatus;
            this.error = error;
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

        public RunStatus getRunStatus() {
            return runStatus;
        }

        public Optional<String> getError() {
            return error;
        }
    }

    public static enum RunStatus {
        SUCCESS,
        MISSING,
        ERROR;
    }

}
