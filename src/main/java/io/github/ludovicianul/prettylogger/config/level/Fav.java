package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

public class Fav extends PrettyMarker {

  private Fav() {
    super(MarkerType.FAV, Level.INFO);
  }

  static Fav defaultConfig() {
    return new Fav();
  }
}
