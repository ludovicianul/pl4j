package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class None extends PrettyMarker {

  private None() {
    super(MarkerType.NONE, Level.INFO);
  }

  static None defaultConfig() {
    return new None();
  }
}
