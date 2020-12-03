package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Awaiting extends PrettyConfig {
    private Awaiting() {
        super("awaiting", "…", Ansi.Color.BLUE, Level.INFO);
    }

    static Awaiting defaultConfig() {
        return new Awaiting();
    }
}
