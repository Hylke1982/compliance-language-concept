package com.example.compliance.command;

import com.example.compliance.definition.DefinitionLoader;
import com.example.compliance.definition.SampleDefinition;
import com.example.compliance.definition.exception.DefinitionInvocationException;
import com.example.compliance.model.Compliance;
import com.example.compliance.report.ReportGenerator;
import io.airlift.airline.Command;
import io.airlift.airline.Option;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Optional;

@Command(name = "check", description = "Run the compliancy checks")
public class CheckCommand extends AbstractCommand {

    @Option(name = {"-f", "--file"}, description = "Compliance file", required = true)
    public String file;


    @Option(name = {"--ignore-errors"}, description = "Ignore errors", required = false)
    public boolean ignoreErrors;

    @Override
    public void run() {

        final Optional<byte[]> data = getData(file);
        if (data.isPresent()) {
            final Optional<Compliance> compliance = getCompliance(data);
            final DefinitionLoader definitionLoader = new DefinitionLoader.Builder().addClass(SampleDefinition.class).build();
            final ReportGenerator.Builder reportBuilder = new ReportGenerator.Builder();
            boolean errors = false;
            if (compliance.isPresent()) {
                for (final Compliance.ComplianceStructureRule rule : compliance.get().getRules()) {
                    final String control = rule.getControl();
                    boolean success = false;
                    System.out.println(String.format("Checking control \"%s\"", control));

                    if (definitionLoader.hasControl(control)) {
                        try {
                            definitionLoader.invokeControl(control);
                            success = true;
                        } catch (final DefinitionInvocationException e) {
                            System.err.println(e);
                            errors = true;
                        }
                    } else {
                        System.out.println(String.format("Skipping control \"%s\", no definition found", control));
                    }
                    reportBuilder.addTestCase(control, rule.getDescription(), BigDecimal.ONE, success);
                }
            } else {

            }


            final String output = reportBuilder.build().generate();
            System.out.println(output);
            writeToOutputFile(output);
            // Exit 1 if errors
            if (errors && !ignoreErrors) {
                System.exit(1);
            }
        } else {
            System.out.println("File contains no data");
            System.exit(1);
        }
    }




}
