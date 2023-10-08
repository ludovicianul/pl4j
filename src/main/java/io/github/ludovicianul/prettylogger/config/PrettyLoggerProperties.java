package io.github.ludovicianul.prettylogger.config;

import io.github.ludovicianul.prettylogger.config.level.PrettyLevel;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum PrettyLoggerProperties {
  INSTANCE;

  private static final String showLabelKey = "pl4j.show-labels";
  private static final String showSymbolsKey = "pl4j.show-symbols";
  private static final String boldKey = "pl4j.bold";
  private static final String themeKey = "pl4j.theme";
  private static final String underlineKey = "pl4j.underline";
  private static final String uppercaseLabelKey = "pl4j.uppercase-label";
  private static final String useMarkersKey = "pl4j.use-markers";
  private static final String prefixFormatKey = "pl4j.prefix-format";

  private final Logger LOGGER = LoggerFactory.getLogger(PrettyLoggerProperties.class);
  private boolean showLabels = true;
  private boolean showSymbols = true;
  private boolean bold = true;
  private boolean underline;
  private boolean uppercaseLabel;
  private boolean useMarkers;
  private String theme = "default";
  private Properties themeProperties;
  private String prefixFormat;

  PrettyLoggerProperties() {
    try (InputStream prettyConfig = Thread.currentThread().getContextClassLoader()
      .getResourceAsStream("pl4j.properties")) {
      if (prettyConfig != null) {
        loadProperties(prettyConfig);
      } else {
        LOGGER.warn("No pl4j.properties found on classpath. Will use default values!");
      }
    } catch (IOException e) {
      LOGGER.warn("No pl4j.properties found on classpath. Will use default values!");
    }
    loadTheme();
  }

  private void loadProperties(InputStream prettyConfig) throws IOException {
    Properties properties = new Properties();
    properties.load(prettyConfig);
    showLabels = Boolean.parseBoolean(properties.getProperty(showLabelKey, "true"));
    showSymbols = Boolean.parseBoolean(properties.getProperty(showSymbolsKey, "true"));
    bold = Boolean.parseBoolean(properties.getProperty(boldKey, "true"));
    underline = Boolean.parseBoolean(properties.getProperty(underlineKey, "false"));
    uppercaseLabel = Boolean.parseBoolean(properties.getProperty(uppercaseLabelKey, "false"));
    useMarkers = Boolean.parseBoolean(properties.getProperty(useMarkersKey, "true"));
    theme = properties.getProperty(themeKey, "default");
    prefixFormat = properties.getProperty(prefixFormatKey, "%1$-29s");
  }

  private void loadTheme() {
    try (InputStream themeStream = getClass().getClassLoader()
      .getResourceAsStream("pl4j-" + theme + ".theme")) {
      if (themeStream != null) {
        themeProperties = new Properties();
        themeProperties.load(new InputStreamReader(themeStream, StandardCharsets.UTF_8));
      } else {
        LOGGER.error("There was a problem loading pl4j {} theme!", theme);
      }
    } catch (IOException e) {
      LOGGER.error("There was a problem loading pl4j {} theme!", theme, e);
    }
  }

  public String getSymbol(PrettyLevel level) {
    return themeProperties.getProperty(level.name().toLowerCase() + ".symbol", "");
  }

  public String getLabel(PrettyLevel level) {
    return themeProperties.getProperty(level.name().toLowerCase() + ".label", "");
  }

  public String getColor(PrettyLevel level) {
    return themeProperties.getProperty(level.name().toLowerCase() + ".color", "");
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

  public PrettyLoggerProperties uppercaseLabel(boolean uppercaseLabel) {
    this.uppercaseLabel = uppercaseLabel;
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

  public boolean isUppercaseLabel() {
    return uppercaseLabel;
  }

  public boolean isUseMarkers() {
    return useMarkers;
  }

  public String getPrefixFormat() {
    return this.prefixFormat;
  }

  public void setPrefixFormat(String newFormat) {
    this.prefixFormat = newFormat;
  }
}
