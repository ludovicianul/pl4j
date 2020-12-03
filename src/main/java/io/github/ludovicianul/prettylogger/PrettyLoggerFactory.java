package io.github.ludovicianul.prettylogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrettyLoggerFactory {

    private PrettyLoggerFactory() {
        //ntd
    }

    public static PrettyLogger getLogger(Class<?> clazz) {
        Logger slf4jLogger = LoggerFactory.getLogger(clazz);
        return PrettyLogger.fromSlf4j(slf4jLogger);
    }
}
