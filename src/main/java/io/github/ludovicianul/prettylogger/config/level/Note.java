package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Note extends PrettyMarker {
    private Note() {
        super(MarkerType.NOTE, Level.INFO);
    }

    static Note defaultConfig() {
        return new Note();
    }
}
