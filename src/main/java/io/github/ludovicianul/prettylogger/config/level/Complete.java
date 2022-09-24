package io.github.ludovicianul.prettylogger.config.level;

class Complete extends PrettyMarker {

  private Complete() {
    super(PrettyLevel.COMPLETE);
  }

  static Complete defaultConfig() {
    return new Complete();
  }
}
