package io.github.ludovicianul.prettylogger.config.level;

import io.github.ludovicianul.prettylogger.config.PrettyConfig;

public class ConfigFactory {

    private ConfigFactory() {
        //ntd
    }

    public static PrettyConfig success() {
        return Success.defaultConfig();
    }

    public static PrettyConfig awaiting() {
        return Awaiting.defaultConfig();
    }

    public static PrettyConfig complete() {
        return Complete.defaultConfig();
    }

    public static PrettyConfig debug() {
        return Debug.defaultConfig();
    }

    public static PrettyConfig error() {
        return Error.defaultConfig();
    }

    public static PrettyConfig fatal() {
        return Fatal.defaultConfig();
    }

    public static PrettyConfig info() {
        return Info.defaultConfig();
    }

    public static PrettyConfig note() {
        return Note.defaultConfig();
    }

    public static PrettyConfig pause() {
        return Pause.defaultConfig();
    }

    public static PrettyConfig pending() {
        return Pending.defaultConfig();
    }

    public static PrettyConfig santa() {
        return Santa.defaultConfig();
    }

    public static PrettyConfig star() {
        return Star.defaultConfig();
    }

    public static PrettyConfig start() {
        return Start.defaultConfig();
    }

    public static PrettyConfig stop() {
        return Stop.defaultConfig();
    }

    public static PrettyConfig warning() {
        return Warning.defaultConfig();
    }


}
