package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Warning extends PrettyConfig {
    private Warning() {
        super("warning", "⚠", Ansi.Color.YELLOW, Level.WARN);
    }

    static Warning defaultConfig() {
        return new Warning();
    }
}
