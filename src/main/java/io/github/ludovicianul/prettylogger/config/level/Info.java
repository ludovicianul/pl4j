package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Info extends PrettyMarker {
    private Info() {
        super(MarkerType.INFO, Level.INFO);
    }

    static Info defaultConfig() {
        return new Info();
    }
}
