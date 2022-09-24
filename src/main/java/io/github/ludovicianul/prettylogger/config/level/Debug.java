package io.github.ludovicianul.prettylogger.config.level;

class Debug extends PrettyMarker {

  private Debug() {
    super(PrettyLevel.DEBUG);
  }

  static Debug defaultConfig() {
    return new Debug();
  }
}
