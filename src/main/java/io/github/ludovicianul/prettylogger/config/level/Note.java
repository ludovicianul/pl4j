package io.github.ludovicianul.prettylogger.config.level;

class Note extends PrettyMarker {

  private Note() {
    super(PrettyLevel.NOTE);
  }

  static Note defaultConfig() {
    return new Note();
  }
}
