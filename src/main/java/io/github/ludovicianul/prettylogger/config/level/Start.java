package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Start extends PrettyMarker {
    private Start() {
        super(MarkerType.START, Level.INFO);
    }

    static Start defaultConfig() {
        return new Start();
    }
}
