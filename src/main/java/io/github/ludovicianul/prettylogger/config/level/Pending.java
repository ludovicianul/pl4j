package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Pending extends PrettyMarker {
    private Pending() {
        super(MarkerType.PENDING, Level.INFO);
    }

    static Pending defaultConfig() {
        return new Pending();
    }
}
