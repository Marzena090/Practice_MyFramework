package driver;

public enum BrowserType {
    // list of browsers
    FIREFOX("firefox"),
    CHROME("chrome"),
    EDGE("edge");

    private final String browser;

    // constructor
    BrowserType(String browser) {
        this.browser = browser;
    }
}
