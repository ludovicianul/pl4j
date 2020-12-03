package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Stop extends PrettyConfig {
    private Stop() {
        super("stop", "◼", Ansi.Color.RED, Level.INFO);
    }

    static Stop defaultConfig() {
        return new Stop();
    }
}
