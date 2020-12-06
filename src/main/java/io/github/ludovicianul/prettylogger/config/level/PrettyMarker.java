package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.fusesource.jansi.Ansi;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.event.Level;

/**
 * Please note that this class is mutable by design. You have the option to start with a base configuration provided by the pre-defined classes
 */
public abstract class PrettyMarker {
    private String label;
    private String symbol;
    private Ansi.Color color;
    private String markerText;
    private Level level;
    private boolean showLabel = PrettyLoggerProperties.INSTANCE.isShowLabels();
    private boolean showSymbol = PrettyLoggerProperties.INSTANCE.isShowSymbols();
    private boolean bold = PrettyLoggerProperties.INSTANCE.isBold();
    private boolean underline = PrettyLoggerProperties.INSTANCE.isUnderline();

    public PrettyMarker(MarkerType markerType, Level level) {
        this.label = PrettyLoggerProperties.INSTANCE.getLabel(markerType);
        this.symbol = PrettyLoggerProperties.INSTANCE.getSymbol(markerType);
        this.color = this.getAnsiColor(markerType);
        this.level = level;
        setMarkerText();
    }

    private String getSymbol() {
        return showSymbol ? getBolded(symbol) : "";
    }

    private String getLabel() {
        return showLabel ? getBolded(getUnderlined(label)) : "";
    }

    private String getBolded(String text) {
        return bold ? Ansi.ansi().bold().a(text).toString() : text;
    }

    private String getUnderlined(String text) {
        return underline ? Ansi.ansi().a(Ansi.Attribute.UNDERLINE).a(text).toString() : text;
    }

    private Ansi.Color getAnsiColor(MarkerType markerType) {
        try {
            return Ansi.Color.valueOf(PrettyLoggerProperties.INSTANCE.getColor(markerType).toUpperCase());
        } catch (Exception e) {
            return Ansi.Color.DEFAULT;
        }
    }

    private void setMarkerText() {
        String text = String.format("%-2s %s", this.getSymbol(), getLabel());
        markerText = Ansi.ansi().fg(color).a(text).reset().toString();
    }

    public PrettyMarker label(String lbl) {
        this.label = lbl;
        setMarkerText();
        return this;
    }

    public PrettyMarker symbol(String smb) {
        this.symbol = smb;
        setMarkerText();
        return this;
    }

    public PrettyMarker color(Ansi.Color clr) {
        this.color = clr;
        setMarkerText();
        return this;
    }

    public PrettyMarker showLabel(boolean show) {
        this.showLabel = show;
        setMarkerText();
        return this;
    }

    public PrettyMarker showSymbol(boolean show) {
        this.showSymbol = show;
        setMarkerText();
        return this;
    }

    public PrettyMarker bold(boolean bold) {
        this.bold = bold;
        setMarkerText();
        return this;
    }

    public PrettyMarker underline(boolean underline) {
        this.underline = underline;
        setMarkerText();
        return this;
    }

    public PrettyMarker level(Level level) {
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
