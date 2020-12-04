package io.github.ludovicianul.prettylogger.config;

import org.fusesource.jansi.Ansi;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.event.Level;

/**
 * Please note that this class is mutable by design. You have the option to start with a base configuration provided by the pre-defined classes
 */
public abstract class PrettyConfig {
    private String label;
    private String symbol;
    private Ansi.Color color;
    private String markerText;
    private Level level;

    public PrettyConfig(String label, String symbol, Ansi.Color color, Level level) {
        this.label = label;
        this.symbol = symbol;
        this.color = color;
        this.level = level;
        setMarkerText();
    }

    private void setMarkerText() {
        String text = String.format("%-2s %s", symbol, label);
        markerText = Ansi.ansi().fg(color).bold().a(text).reset().toString();
    }

    public PrettyConfig label(String lbl) {
        this.label = lbl;
        setMarkerText();
        return this;
    }

    public PrettyConfig symbol(String smb) {
        this.symbol = smb;
        setMarkerText();
        return this;
    }

    public PrettyConfig color(Ansi.Color clr) {
        this.color = clr;
        setMarkerText();
        return this;
    }

    public PrettyConfig level(Level level) {
        this.level = level;
        return this;
    }

    public Level getLevel() {
        return this.level;
    }

    public Marker getMarker() {
        return MarkerFactory.getMarker(markerText);
    }
}
