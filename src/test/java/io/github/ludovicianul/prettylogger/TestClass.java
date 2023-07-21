package io.github.ludovicianul.prettylogger;

import io.github.ludovicianul.prettylogger.config.level.PrettyLevel;
import org.junit.jupiter.api.Test;

class TestClass {

  @Test
  void testDisplay() throws Exception {
    PrettyLogger prettyLogger = PrettyLoggerFactory.getLogger(TestClass.class);
    PrettyLogger.disableLevels(PrettyLevel.ERROR, PrettyLevel.FAV, PrettyLevel.PENDING);
    doLogging(prettyLogger);
  }

  @Test
  void testConsole() throws Exception {
    PrettyLogger prettyLogger = PrettyLoggerFactory.getConsoleLogger();

    doLogging(prettyLogger);
  }

  private void doLogging(PrettyLogger prettyLogger) throws InterruptedException {
    prettyLogger.success("received response from: {}", "http://google.com");
    prettyLogger.awaiting("parsing input data");
    prettyLogger.complete("finish processing");
    prettyLogger.debug("value is: {}", "190");
    prettyLogger.error("not able to connect to: {}", "http://google.com");
    prettyLogger.fav("this is my favorite library");
    prettyLogger.fatal("something went terribly wrong");
    prettyLogger.info("url to connect to: {}", "http://google.com");
    prettyLogger.note("remember to run CATS");
    prettyLogger.pause("process was paused");
    prettyLogger.santa("ho! ho! ho!");
    prettyLogger.star("run CATS next time");
    prettyLogger.start("process started");
    prettyLogger.stop("process paused");
    prettyLogger.warn("unable to normalize string");
    prettyLogger.skip("skip string");
    prettyLogger.pending("connect to url");
    prettyLogger.trace("tracing this");
    prettyLogger.config("configuring stuff!");

    prettyLogger.noFormat("no label");

    prettyLogger.time("job1");
    Thread.sleep(2000);
    prettyLogger.time("job1");
    Thread.sleep(2500);
    prettyLogger.timeEnd("job1");
  }

}
