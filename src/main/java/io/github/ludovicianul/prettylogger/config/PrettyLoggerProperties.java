package io.github.ludovicianul.prettylogger.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

enum PrettyLoggerProperties {
    INSTANCE;

    private static final String showLabelKey = "pl4j.show-labels";
    private static final String showSymbolsKey = "pl4j.show-symbols";
    private static final String boldKey = "pl4j.bold";
    private static final String underlineKey = "pl4j.underline";

    private boolean showLabels = true;
    private boolean showSymbols = true;
    private boolean bold = true;
    private boolean underline;

    PrettyLoggerProperties() {
        final Logger LOGGER = LoggerFactory.getLogger(PrettyLoggerProperties.class);

        try (InputStream prettyConfig = getClass().getClassLoader().getResourceAsStream("pl4j.properties")) {
            if (prettyConfig != null) {
                Properties properties = new Properties();
                properties.load(prettyConfig);
                showLabels = Boolean.parseBoolean(properties.getProperty(showLabelKey, "true"));
                showSymbols = Boolean.parseBoolean(properties.getProperty(showSymbolsKey, "true"));
                bold = Boolean.parseBoolean(properties.getProperty(boldKey, "true"));
                underline = Boolean.parseBoolean(properties.getProperty(underlineKey, "false"));
            } else {
                LOGGER.warn("No pl4j.properties found on classpath. Will use default values!");
            }
        } catch (IOException e) {
            LOGGER.warn("No pl4j.properties found on classpath. Will use default values!");
        }
    }

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
