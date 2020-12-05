package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyMarker;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Star extends PrettyMarker {
    private Star() {
        super("star", "★", Ansi.Color.YELLOW, Level.INFO);
    }

    static Star defaultConfig() {
        return new Star();
    }
}
