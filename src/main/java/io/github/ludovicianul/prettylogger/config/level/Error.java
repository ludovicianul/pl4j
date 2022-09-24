package io.github.ludovicianul.prettylogger.config.level;

class Error extends PrettyMarker {

  private Error() {
    super(PrettyLevel.ERROR);
  }

  static Error defaultConfig() {
    return new Error();
  }
}
