package ndextools.morphcx.processors.csv.configuration;

import ndextools.morphcx.configuration.cli.AbstractBuilder;
import ndextools.morphcx.configuration.cli.AbstractConfiguration;
import ndextools.morphcx.configuration.cli.Builder;

import java.util.Arrays;

/**
 * lemonade.csv.configuration.CSVBuilder is an implementation class for CSV-type Configuration objects.
 */
public final class CSVBuilderImpl extends AbstractBuilder implements Builder, CSVBuilder {
    private char delimiter;
    private String newline;

    @Override
    public AbstractConfiguration getInstance() {
        return new CSVConfiguration(
                commandline,
                appName,
                processId,
                flagIsDebugMode,
                flagShowHelpPrompt,
                flagUsesInputFile,
                flagUsesOutputFile,
                inputFilename,
                outputFilename,
                delimiter,
                newline
        );
    }

    @Override
    public String toString() {
        return "lemonade.csv.configuration.CSVBuilder{" +
                "commandline=" + Arrays.toString(commandline) +
                ", appName=" + appName +
                ", processId=" + processId +
                ", flagIsDebugMode=" + flagIsDebugMode +
                ", flagShowHelpPrompt=" + flagShowHelpPrompt +
                ", flagUsesInputFile=" + flagUsesInputFile +
                ", flagUsesOutputFile=" + flagUsesOutputFile +
                ", inputFilename=" + inputFilename +
                ", outputFilename=" + outputFilename +
                ", delimiter=" + delimiter +
                ", newline=" + newline +
                '}';
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }

    public void setNewline(String newline) {
        this.newline = newline;
    }

}