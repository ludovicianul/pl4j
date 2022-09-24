package io.github.ludovicianul.prettylogger.config.level;

public class Skip extends PrettyMarker {

  private Skip() {
    super(PrettyLevel.SKIP);
  }

  static Skip defaultConfig() {
    return new Skip();
  }
}
