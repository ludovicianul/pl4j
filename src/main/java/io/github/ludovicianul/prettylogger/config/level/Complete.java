package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Complete extends PrettyMarker {
    private Complete() {
        super(MarkerType.COMPLETE, Level.INFO);
    }

    static Complete defaultConfig() {
        return new Complete();
    }
}
