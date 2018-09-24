package com.example.compliance.command;

import io.airlift.airline.Command;
import io.airlift.airline.Option;

import java.util.Optional;

@Command(name = "validate", description = "Validate the compliance file")
public class ValidateCommand extends AbstractCommand {

    @Option(name = {"-f", "--file"}, description = "Compliance file", required = true)
    public String file;

    @Override
    public void run() {

        final Optional<byte[]> data = getData(file);
        if (data.isPresent()) {
            getCompliance(data);
        } else {
            System.out.println("File contains no data");
            System.exit(1);
        }
    }
}
