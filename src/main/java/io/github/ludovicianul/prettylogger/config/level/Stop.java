package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyMarker;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Stop extends PrettyMarker {
    private Stop() {
        super("stop", "\u25A0", Ansi.Color.RED, Level.INFO);
    }

    static Stop defaultConfig() {
        return new Stop();
    }
}
