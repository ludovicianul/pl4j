package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

class Fatal extends PrettyMarker {

  private Fatal() {
    super(MarkerType.FATAL, Level.ERROR);
  }

  static Fatal defaultConfig() {
    return new Fatal();
  }
}
