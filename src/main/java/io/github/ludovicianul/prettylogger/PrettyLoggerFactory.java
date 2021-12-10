package io.github.ludovicianul.prettylogger;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import io.github.ludovicianul.prettylogger.config.level.PrettyMarker;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrettyLoggerFactory {

  private PrettyLoggerFactory() {
    //ntd
  }

  /**
   * This will use {@code System.out} and {@code System.err}.
   *
   * @return a PrettyLogger instance
   */
  public static PrettyLogger getConsoleLogger() {
    return PrettyLoggerConsole.get();
  }

  /**
   * This will use {@code System.out} and {@code System.err}.
   *
   * @param configMap custom PrettyLogger configuration
   * @return a PrettyLogger instance
   */
  public static PrettyLogger getConsoleLogger(Map<MarkerType, PrettyMarker> configMap) {
    return PrettyLoggerConsole.get(configMap);
  }

  /**
   * This will use {@code Slf4j}.
   *
   * @return a PrettyLogger instance
   */
  public static PrettyLogger getLogger(Class<?> clazz) {
    Logger slf4jLogger = LoggerFactory.getLogger(clazz);
    return PrettyLoggerSlf4j.fromSlf4j(slf4jLogger);
  }

  /**
   * This will use {@code Slf4j}.
   *
   * @return a PrettyLogger instance
   */
  public static PrettyLogger getLogger(Class<?> clazz, Map<MarkerType, PrettyMarker> configMap) {
    Logger slf4jLogger = LoggerFactory.getLogger(clazz);
    return PrettyLoggerSlf4j.fromSlf4j(slf4jLogger, configMap);
  }
}