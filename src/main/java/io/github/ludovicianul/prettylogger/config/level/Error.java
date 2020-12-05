package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyMarker;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Error extends PrettyMarker {
    private Error() {
        super("error", "✖", Ansi.Color.RED, Level.ERROR);
    }

    static Error defaultConfig() {
        return new Error();
    }
}
