package io.github.ludovicianul.prettylogger;

import io.github.ludovicianul.prettylogger.config.LogType;
import io.github.ludovicianul.prettylogger.config.PrettyConfig;
import io.github.ludovicianul.prettylogger.config.level.ConfigFactory;
import org.slf4j.Logger;

import java.util.EnumMap;
import java.util.Map;

/**
 * Decorator for the {@code Logger} class that offers additional methods for pretty printing
 * by leveraging the {@link org.slf4j.Marker} functionality
 */
public class PrettyLogger {

    private final Logger slf4jLogger;
    private final EnumMap<LogType, PrettyConfig> config;

    private PrettyLogger(Logger slf4jLogger) {
        this.slf4jLogger = slf4jLogger;
        config = new EnumMap<>(LogType.class);
        config.put(LogType.AWAIT, ConfigFactory.awaiting());
        config.put(LogType.COMPLETE, ConfigFactory.complete());
        config.put(LogType.DEBUG, ConfigFactory.debug());
        config.put(LogType.ERROR, ConfigFactory.error());
        config.put(LogType.FATAL, ConfigFactory.fatal());
        config.put(LogType.INFO, ConfigFactory.info());
        config.put(LogType.NOTE, ConfigFactory.note());
        config.put(LogType.PAUSE, ConfigFactory.pause());
        config.put(LogType.PENDING, ConfigFactory.pending());
        config.put(LogType.SANTA, ConfigFactory.santa());
        config.put(LogType.STAR, ConfigFactory.star());
        config.put(LogType.START, ConfigFactory.start());
        config.put(LogType.STOP, ConfigFactory.stop());
        config.put(LogType.SUCCESS, ConfigFactory.success());
        config.put(LogType.WARN, ConfigFactory.warning());
    }

    private PrettyLogger(Logger slf4jLogger, Map<LogType, PrettyConfig> configMap) {
        this(slf4jLogger);
        config.putAll(configMap);
    }

    public static PrettyLogger fromSlf4j(Logger slf4jLogger) {
        return new PrettyLogger(slf4jLogger);
    }

    public static PrettyLogger fromSlf4j(Logger slf4jLogger, Map<LogType, PrettyConfig> configMap) {
        return new PrettyLogger(slf4jLogger, configMap);
    }

    public void awaiting(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.AWAIT);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void complete(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.COMPLETE);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void debug(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.DEBUG);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void error(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.ERROR);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void fatal(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.FATAL);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void info(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.INFO);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void note(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.NOTE);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void pause(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.PAUSE);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void santa(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.SANTA);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void star(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.STAR);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void start(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.START);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void stop(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.STOP);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void warning(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.WARN);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void success(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.SUCCESS);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void pending(String message, Object... arguments) {
        PrettyConfig loggerConfig = config.get(LogType.PENDING);
        this.logInternal(loggerConfig, message, arguments);
    }

    public void log(PrettyConfig loggerConfig, String message, Object... arguments) {
        this.logInternal(loggerConfig, message, arguments);
    }

    private void logInternal(PrettyConfig config, String message, Object... arguments) {
        switch (config.getLevel()) {
            case ERROR:
                this.slf4jLogger.error(config.getMarker(), message, arguments);
                break;
            case WARN:
                this.slf4jLogger.warn(config.getMarker(), message, arguments);
                break;
            case INFO:
                this.slf4jLogger.info(config.getMarker(), message, arguments);
                break;
            case DEBUG:
                this.slf4jLogger.debug(config.getMarker(), message, arguments);
                break;
            case TRACE:
                this.slf4jLogger.trace(config.getMarker(), message, arguments);
                break;
        }
    }
}
