package io.github.ludovicianul.prettylogger.config.level;

class Star extends PrettyMarker {

  private Star() {
    super(PrettyLevel.STAR);
  }

  static Star defaultConfig() {
    return new Star();
  }
}
