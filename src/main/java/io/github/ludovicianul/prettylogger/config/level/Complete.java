package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Complete extends PrettyConfig {
    private Complete() {
        super("complete", "☒", Ansi.Color.CYAN, Level.INFO);
    }

    static Complete defaultConfig() {
        return new Complete();
    }
}
