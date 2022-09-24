package io.github.ludovicianul.prettylogger.config.level;

class Success extends PrettyMarker {

  private Success() {
    super(PrettyLevel.SUCCESS);
  }

  static Success defaultConfig() {
    return new Success();
  }
}
