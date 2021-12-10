package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Warning extends PrettyMarker {

  private Warning() {
    super(MarkerType.WARNING, Level.WARN);
  }

  static Warning defaultConfig() {
    return new Warning();
  }
}
