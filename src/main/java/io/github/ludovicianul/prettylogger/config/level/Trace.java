package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Trace extends PrettyMarker {

  private Trace() {
    super(MarkerType.TRACE, Level.TRACE);
  }

  static Trace defaultConfig() {
    return new Trace();
  }

}
