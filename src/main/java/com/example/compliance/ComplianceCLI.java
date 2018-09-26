package com.example.compliance;

import com.example.compliance.command.CheckCommand;
import com.example.compliance.command.ValidateCommand;
import io.airlift.airline.Cli;
import io.airlift.airline.Help;
import org.fusesource.jansi.AnsiConsole;

public class ComplianceCLI {

    public static void main(final String[] args) {


        AnsiConsole.systemInstall();

        Cli.CliBuilder<Runnable> builder = Cli.<Runnable>builder("compliance")
                .withDescription("Compliance CLI application")
                .withDefaultCommand(Help.class)
                .withCommands(Help.class, ValidateCommand.class, CheckCommand.class);


        Cli<Runnable> complianceParser = builder.build();
        complianceParser.parse(args).run();


    }


}
