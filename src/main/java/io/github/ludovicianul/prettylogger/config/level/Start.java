package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyMarker;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Start extends PrettyMarker {
    private Start() {
        super("start", "▶", Ansi.Color.GREEN, Level.INFO);
    }

    static Start defaultConfig() {
        return new Start();
    }
}
