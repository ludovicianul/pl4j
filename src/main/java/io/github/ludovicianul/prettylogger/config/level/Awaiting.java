package io.github.ludovicianul.prettylogger.config.level;

class Awaiting extends PrettyMarker {

  private Awaiting() {
    super(PrettyLevel.AWAITING);
  }

  static Awaiting defaultConfig() {
    return new Awaiting();
  }
}
