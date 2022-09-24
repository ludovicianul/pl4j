package io.github.ludovicianul.prettylogger.config.level;

class Stop extends PrettyMarker {

  private Stop() {
    super(PrettyLevel.STOP);
  }

  static Stop defaultConfig() {
    return new Stop();
  }
}
