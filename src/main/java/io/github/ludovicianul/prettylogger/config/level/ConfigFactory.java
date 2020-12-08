package io.github.ludovicianul.prettylogger.config.level;

public class ConfigFactory {

    private ConfigFactory() {
        //ntd
    }

    public static PrettyMarker success() {
        return Success.defaultConfig();
    }

    public static PrettyMarker awaiting() {
        return Awaiting.defaultConfig();
    }

    public static PrettyMarker complete() {
        return Complete.defaultConfig();
    }

    public static PrettyMarker debug() {
        return Debug.defaultConfig();
    }

    public static PrettyMarker error() {
        return Error.defaultConfig();
    }

    public static PrettyMarker fatal() {
        return Fatal.defaultConfig();
    }

    public static PrettyMarker info() {
        return Info.defaultConfig();
    }

    public static PrettyMarker note() {
        return Note.defaultConfig();
    }

    public static PrettyMarker pause() {
        return Pause.defaultConfig();
    }

    public static PrettyMarker pending() {
        return Pending.defaultConfig();
    }

    public static PrettyMarker santa() {
        return Santa.defaultConfig();
    }

    public static PrettyMarker star() {
        return Star.defaultConfig();
    }

    public static PrettyMarker start() {
        return Start.defaultConfig();
    }

    public static PrettyMarker stop() {
        return Stop.defaultConfig();
    }

    public static PrettyMarker warning() {
        return Warning.defaultConfig();
    }

    public static PrettyMarker skip() {
        return Skip.defaultConfig();
    }

}
