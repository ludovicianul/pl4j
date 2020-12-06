package io.github.ludovicianul.prettylogger;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import io.github.ludovicianul.prettylogger.config.level.PrettyMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class PrettyLoggerFactory {

    private PrettyLoggerFactory() {
        //ntd
    }

    public static PrettyLogger getLogger(Class<?> clazz) {
        Logger slf4jLogger = LoggerFactory.getLogger(clazz);
        return PrettyLogger.fromSlf4j(slf4jLogger);
    }

    public static PrettyLogger getLogger(Class<?> clazz, Map<MarkerType, PrettyMarker> configMap) {
        Logger slf4jLogger = LoggerFactory.getLogger(clazz);
        return PrettyLogger.fromSlf4j(slf4jLogger, configMap);
    }
}