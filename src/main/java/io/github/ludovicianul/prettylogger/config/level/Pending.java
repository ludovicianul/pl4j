package io.github.ludovicianul.prettylogger.config.level;

class Pending extends PrettyMarker {

  private Pending() {
    super(PrettyLevel.PENDING);
  }

  static Pending defaultConfig() {
    return new Pending();
  }
}
