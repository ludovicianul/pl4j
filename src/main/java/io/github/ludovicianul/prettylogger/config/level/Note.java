package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Note extends PrettyConfig {
    private Note() {
        super("note", "●", Ansi.Color.BLUE, Level.INFO);
    }

    static Note defaultConfig() {
        return new Note();
    }
}
