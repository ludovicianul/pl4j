package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyMarker;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Complete extends PrettyMarker {
    private Complete() {
        super("complete", "\u2611", Ansi.Color.CYAN, Level.INFO);
    }

    static Complete defaultConfig() {
        return new Complete();
    }
}
