package io.github.ludovicianul.prettylogger.config;

public enum PrettyLoggerProperties {
    INSTANCE;

    private boolean showLabels = true;
    private boolean showSymbols = true;
    private boolean bold = true;
    private boolean underline;

    public PrettyLoggerProperties showLabels(boolean show) {
        this.showLabels = show;
        return this;
    }

    public PrettyLoggerProperties showSymbols(boolean show) {
        this.showSymbols = show;
        return this;
    }

    public PrettyLoggerProperties bold(boolean bolded) {
        this.bold = bolded;
        return this;
    }

    public PrettyLoggerProperties underline(boolean underlined) {
        this.underline = underlined;
        return this;
    }

    public boolean isShowLabels() {
        return showLabels;
    }

    public boolean isShowSymbols() {
        return showSymbols;
    }

    public boolean isBold() {
        return bold;
    }

    public boolean isUnderline() {
        return underline;
    }
}
