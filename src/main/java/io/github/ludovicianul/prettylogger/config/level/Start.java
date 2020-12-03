package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Start extends PrettyConfig {
    private Start() {
        super("start", "▶", Ansi.Color.GREEN, Level.INFO);
    }

    static Start defaultConfig() {
        return new Start();
    }
}
