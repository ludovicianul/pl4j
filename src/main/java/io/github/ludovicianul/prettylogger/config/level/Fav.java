package io.github.ludovicianul.prettylogger.config.level;

public class Fav extends PrettyMarker {

  private Fav() {
    super(PrettyLevel.FAV);
  }

  static Fav defaultConfig() {
    return new Fav();
  }
}
