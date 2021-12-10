package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.MarkerType;
import org.slf4j.event.Level;

public class Skip extends PrettyMarker {

  private Skip() {
    super(MarkerType.SKIP, Level.INFO);
  }

  static Skip defaultConfig() {
    return new Skip();
  }
}
