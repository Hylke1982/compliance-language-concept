package com.example.compliance.command;

import com.example.compliance.language.ComplianceLexer;
import com.example.compliance.language.ComplianceParser;
import com.example.compliance.model.Compliance;
import com.example.compliance.parser.ComplianceListener;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public abstract class AbstractCommand implements Runnable {

    protected Optional<byte[]> getData(final String file) {

        Optional<byte[]> dataBytes = Optional.empty();

        if (Optional.ofNullable(file).isPresent()) {
            final Path path = Paths.get(file);
            final File dataFile = path.toFile();
            if (dataFile.exists() && dataFile.isFile()) {
                try {
                    dataBytes = Optional.of(Files.readAllBytes(path));
                } catch (IOException e) {
                    System.out.println(String.format("File data from file with name '%s' cannot be read", file));
                    System.exit(1);
                }
            } else {
                System.out.println(String.format("File with name '%s' cannot be found", file));
                System.exit(1);
            }
        }
        return dataBytes;
    }

    protected Optional<Compliance> getCompliance(Optional<byte[]> data) {
        Optional compliance = Optional.empty();
        try {

            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data.get());
            ComplianceLexer lexer = new ComplianceLexer(CharStreams.fromStream(byteArrayInputStream));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ComplianceParser parser = new ComplianceParser(tokens);
            ParseTree tree = parser.document();

            ComplianceListener listener = new ComplianceListener();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);

            compliance = Optional.of(listener.getComplianceStructure());

            for (ANTLRErrorListener listenerz : parser.getErrorListeners()) {
                System.out.println(listenerz);
            }
        } catch (IOException e) {

        }
        return compliance;
    }

    protected void writeToOutputFile(String output) {
        try {
            FileUtils.write(new File("output.txt"),output, Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.exit(1);
        }
    }
}
