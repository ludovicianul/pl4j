package io.github.ludovicianul.prettylogger.config.level;

class Trace extends PrettyMarker {

  private Trace() {
    super(PrettyLevel.TRACE);
  }

  static Trace defaultConfig() {
    return new Trace();
  }

}
