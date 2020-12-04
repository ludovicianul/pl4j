package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Info extends PrettyConfig {
    private Info() {
        super("info", "\u24D8", Ansi.Color.BLUE, Level.INFO);
    }

    static Info defaultConfig() {
        return new Info();
    }
}
