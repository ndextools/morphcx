package ndextools.morphcx.processors.csv.configuration;

import ndextools.morphcx.configuration.cli.Template;
import org.apache.commons.cli.CommandLine;

public interface CSVTemplate extends Template {

    /**
     * Resolves additional commandline options that are associated with a Configuration Type.
     */
    void resolveExtendedOptions(CommandLine parsedCommandline, CSVBuilder builder);

}