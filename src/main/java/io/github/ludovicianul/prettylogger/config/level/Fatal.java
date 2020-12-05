package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyMarker;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

 class Fatal extends PrettyMarker {
    private Fatal() {
        super("fatal", "‼", Ansi.Color.RED, Level.ERROR);
    }

    static Fatal defaultConfig() {
        return new Fatal();
    }
}
