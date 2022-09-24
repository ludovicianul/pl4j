package io.github.ludovicianul.prettylogger.config.level;

class Warning extends PrettyMarker {

  private Warning() {
    super(PrettyLevel.WARNING);
  }

  static Warning defaultConfig() {
    return new Warning();
  }
}
