package io.github.ludovicianul.prettylogger.config.level;

class Info extends PrettyMarker {

  private Info() {
    super(PrettyLevel.INFO);
  }

  static Info defaultConfig() {
    return new Info();
  }
}
