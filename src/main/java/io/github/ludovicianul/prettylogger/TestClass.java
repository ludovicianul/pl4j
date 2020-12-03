package io.github.ludovicianul.prettylogger;

public class TestClass {

    public static void main(String... args) {
        PrettyLogger prettyLogger = PrettyLoggerFactory.getLogger(TestClass.class);

        prettyLogger.success("received response from: {}", "http://google.com");
        prettyLogger.awaiting("parsing input data");
        prettyLogger.complete("finish processing");
        prettyLogger.debug("value is: {}", "190");
        prettyLogger.error("not able to connect to: {}", "http://google.com");
        prettyLogger.fatal("something went terribly wrong");
        prettyLogger.info("url to connect to: {}", "http://google.com");
        prettyLogger.note("remember to run CATS");
        prettyLogger.pause("process was paused");
        prettyLogger.santa("ho! ho! ho!");
        prettyLogger.star("run CATS next time");
        prettyLogger.start("process started");
        prettyLogger.stop("process paused");
        prettyLogger.warning("unable to normalize string");
    }
}
