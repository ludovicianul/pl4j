package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyMarker;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Pause extends PrettyMarker {
    private Pause() {
        super("pause", "\u25A0", Ansi.Color.YELLOW, Level.INFO);
    }

    static Pause defaultConfig() {
        return new Pause();
    }
}
