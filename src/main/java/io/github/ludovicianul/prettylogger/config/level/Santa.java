package io.github.ludovicianul.prettylogger.config.level;

class Santa extends PrettyMarker {

  private Santa() {
    super(PrettyLevel.SANTA);
  }

  static Santa defaultConfig() {
    return new Santa();
  }
}
