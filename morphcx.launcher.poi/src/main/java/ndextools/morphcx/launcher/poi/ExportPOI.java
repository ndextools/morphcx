package ndextools.morphcx.launcher.poi;

import ndextools.morphcx.configuration.cli.base.*;

/**
 * Root program containing entry point to launch application by commandline.
 */
public class ExportPOI {

    public static void main(final String[] args) {
        String[] cmdline = (args == null) ? new String[0] : args;
        String appName = ExportPOI.class.getSimpleName().toLowerCase();

        try {
            Configuration cfg = configureByCLI(cmdline, appName);
            System.err.println(cfg.toString());  // TODO remove
            dispatchByOperation(cfg);
        } catch (org.apache.commons.cli.ParseException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static Configuration configureByCLI(final String[] commandline, final String appName)
            throws org.apache.commons.cli.ParseException {
        Template template = new TemplateBaseOptions(commandline, appName);
        Builder builder = new BuilderBaseOptions();
        return template.configure(builder);
    }

    private static void dispatchByOperation(final Configuration cfg) {
        if (!cfg.isShowHelpPrompt()) {
            // TODO
        }
        System.err.println(cfg.toString()); // TODO remove
    }

}