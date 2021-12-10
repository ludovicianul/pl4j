package io.github.ludovicianul.prettylogger;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import io.github.ludovicianul.prettylogger.config.level.ConfigFactory;
import io.github.ludovicianul.prettylogger.config.level.PrettyMarker;
import java.util.EnumMap;
import java.util.Map;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.event.Level;

/**
 * Decorator for the {@code Logger} class that offers additional methods for pretty printing by
 * leveraging the {@link org.slf4j.Marker} functionality
 */
public abstract class PrettyLogger {

  private static final String INIT_TIMER = "Timer starting...";
  private static final String INTERIM_TIMER = "Interim timer run for: {}ms";
  private static final String END_TIMER = "Timer run for: {}ms";
  protected final EnumMap<MarkerType, PrettyMarker> config;

  protected PrettyLogger() {
    config = new EnumMap<>(MarkerType.class);
    config.put(MarkerType.AWAITING, ConfigFactory.awaiting());
    config.put(MarkerType.COMPLETE, ConfigFactory.complete());
    config.put(MarkerType.DEBUG, ConfigFactory.debug());
    config.put(MarkerType.ERROR, ConfigFactory.error());
    config.put(MarkerType.FAV, ConfigFactory.fav());
    config.put(MarkerType.FATAL, ConfigFactory.fatal());
    config.put(MarkerType.INFO, ConfigFactory.info());
    config.put(MarkerType.NOTE, ConfigFactory.note());
    config.put(MarkerType.PAUSE, ConfigFactory.pause());
    config.put(MarkerType.PENDING, ConfigFactory.pending());
    config.put(MarkerType.SANTA, ConfigFactory.santa());
    config.put(MarkerType.STAR, ConfigFactory.star());
    config.put(MarkerType.START, ConfigFactory.start());
    config.put(MarkerType.STOP, ConfigFactory.stop());
    config.put(MarkerType.SUCCESS, ConfigFactory.success());
    config.put(MarkerType.WARNING, ConfigFactory.warning());
    config.put(MarkerType.SKIP, ConfigFactory.skip());
    config.put(MarkerType.NONE, ConfigFactory.none());
    config.put(MarkerType.TRACE, ConfigFactory.trace());
  }

  public void noFormat(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.NONE);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void noFormat(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.none().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void trace(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.TRACE);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void trace(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.trace().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void awaiting(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.AWAITING);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void awaiting(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.awaiting().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void complete(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.COMPLETE);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void complete(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.complete().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void debug(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.DEBUG);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void debug(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.debug().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void error(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.ERROR);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void error(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.error().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void fatal(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.FATAL);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void fatal(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.fatal().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void info(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.INFO);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void info(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.info().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void note(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.NOTE);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void note(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.note().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void pause(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.PAUSE);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void pause(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.pause().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void santa(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.SANTA);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void santa(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.santa().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void star(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.STAR);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void star(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.star().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void start(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.START);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void start(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.start().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void stop(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.STOP);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void stop(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.stop().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void warn(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.WARNING);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void warn(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.warning().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void warning(String message, Object... arguments) {
    this.warn(message, arguments);
  }

  public void warning(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    this.warn(config, message, arguments);
  }

  public void success(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.SUCCESS);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void success(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.success().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void skip(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.SKIP);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void skip(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.skip().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void skipping(String message, Object... arguments) {
    this.skip(message, arguments);
  }

  public void skipping(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    this.skip(config, message, arguments);
  }

  public void pending(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.PENDING);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void pending(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.pending().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void fav(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.FAV);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void fav(Map<PrettyMarker.ConfigKey, Object> config, String message, Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.fav().fromConfig(config);
    this.logInternal(loggerConfig, message, arguments);
  }

  public void log(PrettyMarker loggerConfig, String message, Object... arguments) {
    this.logInternal(loggerConfig, message, arguments);
  }

  public void time(String timerKey) {
    if (MDC.get(timerKey) != null) {
      interimTimer(timerKey, INTERIM_TIMER);
    } else {
      newTimer(timerKey);
    }
  }

  private void interimTimer(String timerKey, String label) {
    PrettyMarker timerMarker = ConfigFactory.stop().label(timerKey);
    final long endTime = System.currentTimeMillis();
    long startTime;
    try {
      startTime = Long.parseLong(MDC.get(timerKey));
    } catch (Exception e) {
      startTime = endTime;
    }
    this.logInternal(timerMarker, label, (endTime - startTime));
  }

  private void newTimer(String timerKey) {
    PrettyMarker timerMarker = ConfigFactory.start().label(timerKey);
    MDC.put(timerKey, String.valueOf(System.currentTimeMillis()));
    this.logInternal(timerMarker, INIT_TIMER);
  }

  public void timeEnd(String timerKey) {
    this.interimTimer(timerKey, END_TIMER);
  }

  void logInternal(PrettyMarker config, String message, Object... arguments) {
    Marker marker = this.getMarker(config);
    String finalMessage = this.getMessage(config.getMarker(), message);

    this.logInternal(config.getLevel(), marker, finalMessage, arguments);
  }

  abstract String getMessage(Marker marker, String message);

  abstract Marker getMarker(PrettyMarker config);

  abstract void logInternal(Level level, Marker marker, String message, Object... arguments);
}
