package io.github.ludovicianul.prettylogger.config.level;

class Pause extends PrettyMarker {

  private Pause() {
    super(PrettyLevel.PAUSE);
  }

  static Pause defaultConfig() {
    return new Pause();
  }
}
