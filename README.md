<h1 align="center">
  Pretty Logger for Java (PL4J)
</h1>
<div align="center">
  <img alt="Loggers" src="images/loggers.png" width="90%">
</div>

# Description

`Pretty Logger for Java` is a [slf4j](http://www.slf4j.org/) decorator than enables pretty printing on the console
using [ANSI formatting](https://en.wikipedia.org/wiki/ANSI_escape_code)
through [jansi](http://fusesource.github.io/jansi/). PL4J is built around the concept
of [Markers](http://www.slf4j.org/faq.html#marker_interface). This means that you can only
use [logback](http://logback.qos.ch/) as an implementation, being the only SLF4J binding that supports Markers.

# Usage

Add it as a Maven dependency in your `pom.xml` file:

```xml

<dependency>
    <groupId>io.github.ludovicianul</groupId>
    <artifactId>pretty-logger</artifactId>
    <version>LATEST</version>
</dependency>
```

```java
 public class TestClass {

    public static void main(String... args) {
        PrettyLogger prettyLogger = PrettyLoggerFactory.getLogger(TestClass.class); //same declaration as SLF4J

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
```

# Configuration

## Log Pattern

This is a sample logback configuration file that was used to display the above top console output:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration debug="false">
    <statusListener class="ch.qos.logback.core.status.NopStatusListener"/>
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <withJansi>true</withJansi>
        <encoder class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
            <pattern>%-22marker %msg%n</pattern>
        </encoder>
    </appender>
    <root level="trace">
        <appender-ref ref="STDOUT"/>
    </root>
</configuration>
```

The `pattern` must contain the `%masker` keyword, otherwise no `label` or `symbol` will be displayed.

## Log Level and Markers

PL4J uses the following mapping between the SLF4J log levels and the markers:

| SLF4J Log Level  |  PL4J Marker|
|---|---|
| `debug`  |  `debug` |
| `info`  | `awaiting, complete, info, note, pause, pending, santa, star, start, stop, success`  |
|  `warn` | `warning`  |
|  `error` |  `error, fatal` |

## Markers Configuration

You can override the default Markers as follows:

```java
import io.github.ludovicianul.prettylogger.config.PrettyMarker;
import io.github.ludovicianul.prettylogger.PrettyLogger;
import io.github.ludovicianul.prettylogger.config.level.ConfigFactory;

public class TestClass {

    public static void main(String... args) {
        PrettyLogger prettyLogger = PrettyLoggerFactory.getLogger(TestClass.class);
        PrettyMarker config = ConfigFactory.error().label("err");// we change the label to `err` instead of `error`
        prettyLogger.log(config, "this is an error");//note that we use log() instead of error()
    }
}
```

# Credits

Inspired by [signale](https://github.com/klaussinani/signale).