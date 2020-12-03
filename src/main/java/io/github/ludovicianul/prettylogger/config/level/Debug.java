package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Debug extends PrettyConfig {
    private Debug() {
        super("debug", "◯", Ansi.Color.MAGENTA, Level.DEBUG);
    }

    static Debug defaultConfig() {
        return new Debug();
    }
}
