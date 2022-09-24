package io.github.ludovicianul.prettylogger.config.level;

class None extends PrettyMarker {

  private None() {
    super(PrettyLevel.NONE);
  }

  static None defaultConfig() {
    return new None();
  }
}
