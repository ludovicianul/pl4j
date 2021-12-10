package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Awaiting extends PrettyMarker {

  private Awaiting() {
    super(MarkerType.AWAITING, Level.INFO);
  }

  static Awaiting defaultConfig() {
    return new Awaiting();
  }
}
