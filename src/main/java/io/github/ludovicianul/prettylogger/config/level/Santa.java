package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Santa extends PrettyMarker {
    private Santa() {
        super(MarkerType.SANTA, Level.INFO);
    }

    static Santa defaultConfig() {
        return new Santa();
    }
}
