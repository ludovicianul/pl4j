package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Pause extends PrettyMarker {
    private Pause() {
        super(MarkerType.PAUSE, Level.INFO);
    }

    static Pause defaultConfig() {
        return new Pause();
    }
}
