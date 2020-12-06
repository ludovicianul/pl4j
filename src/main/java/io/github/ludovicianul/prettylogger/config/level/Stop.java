package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Stop extends PrettyMarker {
    private Stop() {
        super(MarkerType.STOP, Level.INFO);
    }

    static Stop defaultConfig() {
        return new Stop();
    }
}
