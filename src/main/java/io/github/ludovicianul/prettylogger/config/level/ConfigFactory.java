package io.github.ludovicianul.prettylogger.config.level;

public class ConfigFactory {

  private ConfigFactory() {
    //ntd
  }

  public static PrettyMarker success() {
    return new PrettyMarker(PrettyLevel.SUCCESS);
  }

  public static PrettyMarker awaiting() {
    return new PrettyMarker(PrettyLevel.AWAITING);
  }

  public static PrettyMarker complete() {
    return new PrettyMarker(PrettyLevel.COMPLETE);
  }

  public static PrettyMarker debug() {
    return new PrettyMarker(PrettyLevel.DEBUG);
  }

  public static PrettyMarker error() {
    return new PrettyMarker(PrettyLevel.ERROR);
  }

  public static PrettyMarker fatal() {
    return new PrettyMarker(PrettyLevel.FATAL);
  }

  public static PrettyMarker fav() {
    return new PrettyMarker(PrettyLevel.FAV);
  }

  public static PrettyMarker info() {
    return new PrettyMarker(PrettyLevel.INFO);
  }

  public static PrettyMarker note() {
    return new PrettyMarker(PrettyLevel.NOTE);
  }

  public static PrettyMarker pause() {
    return new PrettyMarker(PrettyLevel.PAUSE);
  }

  public static PrettyMarker pending() {
    return new PrettyMarker(PrettyLevel.PENDING);
  }

  public static PrettyMarker santa() {
    return new PrettyMarker(PrettyLevel.SANTA);
  }

  public static PrettyMarker star() {
    return new PrettyMarker(PrettyLevel.STAR);
  }

  public static PrettyMarker start() {
    return new PrettyMarker(PrettyLevel.START);
  }

  public static PrettyMarker stop() {
    return new PrettyMarker(PrettyLevel.STOP);
  }

  public static PrettyMarker warning() {
    return new PrettyMarker(PrettyLevel.WARNING);
  }

  public static PrettyMarker skip() {
    return new PrettyMarker(PrettyLevel.SKIP);
  }

  public static PrettyMarker none() {
    return new PrettyMarker(PrettyLevel.NONE);
  }

  public static PrettyMarker trace() {
    return new PrettyMarker(PrettyLevel.TRACE);
  }

}
