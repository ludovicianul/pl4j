package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;


class Success extends PrettyMarker {
    private Success() {
        super(MarkerType.SUCCESS, Level.INFO);
    }

    static Success defaultConfig() {
        return new Success();
    }
}
