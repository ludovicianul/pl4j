package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyLoggerProperties;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.fusesource.jansi.Ansi;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Please note that this class is mutable by design. You have the option to start with a base
 * configuration provided by the pre-defined classes
 */
public class PrettyMarker {

  private final Map<ConfigKey, Object> configuration;
  private String markerText;

  public PrettyMarker(PrettyLevel level) {
    configuration = new HashMap<>();
    configuration.put(ConfigKey.LABEL, PrettyLoggerProperties.INSTANCE.getLabel(level));
    configuration.put(ConfigKey.SYMBOL, PrettyLoggerProperties.INSTANCE.getSymbol(level));
    configuration.put(ConfigKey.COLOR, getAnsiColor(level));
    configuration.put(ConfigKey.LOG_LEVEL, level);
    configuration.put(ConfigKey.SHOW_LABEL, PrettyLoggerProperties.INSTANCE.isShowLabels());
    configuration.put(ConfigKey.SHOW_SYMBOL, PrettyLoggerProperties.INSTANCE.isShowSymbols());
    configuration.put(ConfigKey.BOLD, PrettyLoggerProperties.INSTANCE.isBold());
    configuration.put(ConfigKey.UNDERLINE, PrettyLoggerProperties.INSTANCE.isUnderline());
    configuration.put(ConfigKey.UPPERCASE_LABEL, PrettyLoggerProperties.INSTANCE.isUppercaseLabel());
    setMarkerText();
  }

  public PrettyMarker fromConfig(Map<PrettyMarker.ConfigKey, Object> config) {
    this.configuration.putAll(config);
    return this;
  }

  private boolean isTrue(ConfigKey key) {
    return Boolean.parseBoolean(String.valueOf(configuration.get(key)));
  }

  private String getProperty(ConfigKey key) {
    return String.valueOf(configuration.get(key));
  }

  private Ansi.Color getColor() {
    return (Ansi.Color) configuration.get(ConfigKey.COLOR);
  }

  private String getSymbol() {
    return isTrue(ConfigKey.SHOW_SYMBOL) ? getBolded(this.getProperty(ConfigKey.SYMBOL)) : "";
  }

  private String getLabel() {
    String initialText = isTrue(ConfigKey.SHOW_LABEL) ? this.getBolded(
      this.getUpperCase(this.getProperty(ConfigKey.LABEL))) : "";
    return this.getUnderlined(initialText);
  }

  private String getUpperCase(String text) {
    return isTrue(ConfigKey.UPPERCASE_LABEL) ? text.toUpperCase(Locale.ROOT) : text;
  }

  private String getBolded(String text) {
    return isTrue(ConfigKey.BOLD) ? Ansi.ansi().bold().a(text).toString() : text;
  }

  private String getUnderlined(String text) {
    return isTrue(ConfigKey.UNDERLINE) ? Ansi.ansi().a(Ansi.Attribute.UNDERLINE).a(text).toString()
      : text;
  }

  private Ansi.Color getAnsiColor(PrettyLevel prettyLevel) {
    try {
      return Ansi.Color.valueOf(PrettyLoggerProperties.INSTANCE.getColor(prettyLevel).toUpperCase());
    } catch (Exception e) {
      return Ansi.Color.DEFAULT;
    }
  }

  private void setMarkerText() {
    String text = this.getSymbol() + " " + getLabel();
    markerText = Ansi.ansi().fg(this.getColor()).a(text).reset().toString();
  }

  public PrettyMarker label(String lbl) {
    this.configuration.put(ConfigKey.LABEL, lbl);
    setMarkerText();
    return this;
  }

  public PrettyMarker symbol(String smb) {
    this.configuration.put(ConfigKey.SYMBOL, smb);
    setMarkerText();
    return this;
  }

  public PrettyMarker color(Ansi.Color clr) {
    this.configuration.put(ConfigKey.COLOR, clr);
    setMarkerText();
    return this;
  }

  public PrettyMarker showLabel(boolean show) {
    this.configuration.put(ConfigKey.SHOW_LABEL, show);
    setMarkerText();
    return this;
  }

  public PrettyMarker showSymbol(boolean show) {
    this.configuration.put(ConfigKey.SHOW_SYMBOL, show);
    setMarkerText();
    return this;
  }

  public PrettyMarker bold(boolean bold) {
    this.configuration.put(ConfigKey.BOLD, bold);
    setMarkerText();
    return this;
  }

  public PrettyMarker underline(boolean underline) {
    this.configuration.put(ConfigKey.UNDERLINE, underline);
    setMarkerText();
    return this;
  }

  public PrettyMarker uppercaseLabel(boolean uppercaseLabel) {
    this.configuration.put(ConfigKey.UPPERCASE_LABEL, uppercaseLabel);
    setMarkerText();
    return this;
  }

  public PrettyMarker level(PrettyLevel level) {
    this.configuration.put(ConfigKey.LOG_LEVEL, level);
    return this;
  }

  public PrettyLevel getLevel() {
    return (PrettyLevel) configuration.get(ConfigKey.LOG_LEVEL);
  }

  public Marker getMarker() {
    return MarkerFactory.getMarker(markerText);
  }

  public enum ConfigKey {
    BOLD,
    UNDERLINE,
    SHOW_LABEL,
    SHOW_SYMBOL,
    COLOR,
    LOG_LEVEL,
    SYMBOL,
    LABEL,
    UPPERCASE_LABEL
  }
}
