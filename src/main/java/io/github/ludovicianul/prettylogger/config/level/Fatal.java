package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

 class Fatal extends PrettyConfig {
    private Fatal() {
        super("fatal", "‼", Ansi.Color.RED, Level.ERROR);
    }

    static Fatal defaultConfig() {
        return new Fatal();
    }
}
