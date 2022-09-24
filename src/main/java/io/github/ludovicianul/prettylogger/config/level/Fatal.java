package io.github.ludovicianul.prettylogger.config.level;

class Fatal extends PrettyMarker {

  private Fatal() {
    super(PrettyLevel.FATAL);
  }

  static Fatal defaultConfig() {
    return new Fatal();
  }
}
