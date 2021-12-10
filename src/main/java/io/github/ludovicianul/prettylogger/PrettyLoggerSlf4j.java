package io.github.ludovicianul.prettylogger;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import io.github.ludovicianul.prettylogger.config.PrettyLoggerProperties;
import io.github.ludovicianul.prettylogger.config.level.PrettyMarker;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;

class PrettyLoggerSlf4j extends PrettyLogger {

  private final Logger slf4jLogger;

  private PrettyLoggerSlf4j(Logger slf4jLogger) {
    super();
    this.slf4jLogger = slf4jLogger;
  }

  private PrettyLoggerSlf4j(Logger slf4jLogger, Map<MarkerType, PrettyMarker> configMap) {
    this(slf4jLogger);
    config.putAll(configMap);
  }

  static PrettyLogger fromSlf4j(Logger slf4jLogger) {
    return new PrettyLoggerSlf4j(slf4jLogger);
  }

  static PrettyLogger fromSlf4j(Logger slf4jLogger, Map<MarkerType, PrettyMarker> configMap) {
    return new PrettyLoggerSlf4j(slf4jLogger, configMap);
  }

  Marker getMarker(PrettyMarker config) {
    if (PrettyLoggerProperties.INSTANCE.isUseMarkers()) {
      return config.getMarker();
    } else {
      return null;
    }
  }

  String getMessage(Marker marker, String message) {
    if (PrettyLoggerProperties.INSTANCE.isUseMarkers()) {
      return message;
    } else {
      return String.format(PrettyLoggerProperties.INSTANCE.getPrefixFormat(), marker.getName())
          + message;
    }
  }

  void logInternal(Level level, Marker marker, String message, Object... arguments) {
    switch (level) {
      case ERROR:
        this.slf4jLogger.error(marker, message, arguments);
        break;
      case WARN:
        this.slf4jLogger.warn(marker, message, arguments);
        break;
      case INFO:
        this.slf4jLogger.info(marker, message, arguments);
        break;
      case DEBUG:
        this.slf4jLogger.debug(marker, message, arguments);
        break;
      case TRACE:
        this.slf4jLogger.trace(marker, message, arguments);
        break;
    }
  }
}
