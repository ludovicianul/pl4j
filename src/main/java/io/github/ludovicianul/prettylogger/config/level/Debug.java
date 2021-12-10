package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Debug extends PrettyMarker {

  private Debug() {
    super(MarkerType.DEBUG, Level.DEBUG);
  }

  static Debug defaultConfig() {
    return new Debug();
  }
}
