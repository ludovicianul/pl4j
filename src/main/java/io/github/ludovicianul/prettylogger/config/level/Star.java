package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Star extends PrettyMarker {

  private Star() {
    super(MarkerType.STAR, Level.INFO);
  }

  static Star defaultConfig() {
    return new Star();
  }
}
