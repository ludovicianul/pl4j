package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Error extends PrettyMarker {

  private Error() {
    super(MarkerType.ERROR, Level.ERROR);
  }

  static Error defaultConfig() {
    return new Error();
  }
}
