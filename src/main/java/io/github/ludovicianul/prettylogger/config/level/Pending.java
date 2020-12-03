package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Pending extends PrettyConfig {
    private Pending() {
        super("pending", "☐", Ansi.Color.MAGENTA, Level.INFO);
    }

    static Pending defaultConfig() {
        return new Pending();
    }
}
