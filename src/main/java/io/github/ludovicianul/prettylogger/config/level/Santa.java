package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyMarker;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;

class Santa extends PrettyMarker {
    private Santa() {
        super("santa", "\uD83C\uDF85", Ansi.Color.RED, Level.INFO);
    }

    static Santa defaultConfig() {
        return new Santa();
    }
}
