package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import org.fusesource.jansi.Ansi;
import org.slf4j.event.Level;


class Success extends PrettyConfig {
    private Success() {
        super("success", "✔", Ansi.Color.GREEN, Level.INFO);
    }

    static Success defaultConfig() {
        return new Success();
    }
}
