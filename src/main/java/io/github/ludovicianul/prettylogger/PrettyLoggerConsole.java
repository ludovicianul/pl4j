package io.github.ludovicianul.prettylogger;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import io.github.ludovicianul.prettylogger.config.PrettyLoggerProperties;
import io.github.ludovicianul.prettylogger.config.level.ConfigFactory;
import io.github.ludovicianul.prettylogger.config.level.PrettyMarker;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import org.slf4j.event.Level;

class PrettyLoggerConsole extends PrettyLogger {

  private PrettyLoggerConsole() {
    super();
  }

  private PrettyLoggerConsole(Map<MarkerType, PrettyMarker> configMap) {
    this();
    config.putAll(configMap);
  }

  static PrettyLogger get() {
    return new PrettyLoggerConsole();
  }

  static PrettyLogger get(Map<MarkerType, PrettyMarker> configMap) {
    return new PrettyLoggerConsole(configMap);
  }

  private static String replaceBrackets(String message, Object... params) {
    for (Object obj : params) {
      message = message.replaceFirst(Pattern.quote("{}"),
          Matcher.quoteReplacement(String.valueOf(obj)));
    }

    return message;
  }

  @Override
  public void noFormat(String message, Object... arguments) {
    PrettyMarker loggerConfig = config.get(MarkerType.NONE);

    this.logInternal(loggerConfig.getLevel(), null, message, arguments);
  }

  @Override
  public void noFormat(Map<PrettyMarker.ConfigKey, Object> config, String message,
      Object... arguments) {
    PrettyMarker loggerConfig = ConfigFactory.none().fromConfig(config);

    this.logInternal(loggerConfig.getLevel(), null, message, arguments);
  }

  @Override
  String getMessage(Marker marker, String message) {
    return String.format(PrettyLoggerProperties.INSTANCE.getPrefixFormat(), marker.getName())
        + message;
  }

  @Override
  Marker getMarker(PrettyMarker config) {
    return null;
  }

  void logInternal(Level level, Marker marker, String message, Object... arguments) {
    String result = replaceBrackets(message, arguments);
    switch (level) {
      case ERROR:
        System.err.println(result);
        break;
      case WARN:
      case INFO:
      case DEBUG:
      case TRACE:
        System.out.println(result);
        break;
    }
  }
}
