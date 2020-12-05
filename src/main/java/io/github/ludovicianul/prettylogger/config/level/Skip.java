package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyMarker;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

public class Skip extends PrettyMarker {
    private Skip() {
        super("skipping", "\u226B", Ansi.Color.BLUE, Level.INFO);
    }

    static Skip defaultConfig() {
        return new Skip();
    }
}
