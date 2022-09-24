package io.github.ludovicianul.prettylogger.config.level;

class Start extends PrettyMarker {

  private Start() {
    super(PrettyLevel.START);
  }

  static Start defaultConfig() {
    return new Start();
  }
}
