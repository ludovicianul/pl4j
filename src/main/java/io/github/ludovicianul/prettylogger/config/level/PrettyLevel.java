package io.github.ludovicianul.prettylogger.config.level;

import org.slf4j.event.Level;

public enum PrettyLevel {
  TIMER(214, Level.INFO),
  CONFIG(213, Level.INFO),
  AWAITING(212, Level.INFO),
  COMPLETE(211, Level.INFO),
  DEBUG(101, Level.DEBUG),
  ERROR(400, Level.ERROR),
  FAV(210, Level.INFO),
  FATAL(401, Level.ERROR),
  INFO(209, Level.INFO),
  NOTE(208, Level.INFO),
  PAUSE(207, Level.INFO),
  PENDING(206, Level.INFO),
  SANTA(205, Level.INFO),
  STAR(204, Level.INFO),
  START(203, Level.INFO),
  STOP(202, Level.INFO),
  SKIP(201, Level.INFO),
  SUCCESS(200, Level.INFO),
  WARNING(300, Level.WARN),
  TRACE(100, Level.TRACE),
  NONE(0, Level.INFO);

  private final int level;
  private final Level slf4JLevel;

  PrettyLevel(int lvl, Level slf4JLevel) {
    this.level = lvl;
    this.slf4JLevel = slf4JLevel;
  }

  public int toInt() {
    return level;
  }

  public Level slf4JLevel() {
    return this.slf4JLevel;
  }

  public String toString() {
    return this.name();
  }
}
