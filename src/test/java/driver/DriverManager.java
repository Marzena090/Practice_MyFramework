package driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static final BrowserType BROWSER_TYPE = BrowserType.CHROME;
    private static WebDriver driver;
    // constructor
    private DriverManager() {
    }

    // method that returns us a new instance of
    // WebDriver if the driver has not been initialized before - null
    public static WebDriver getWebDriver() {

        if (driver == null) {
            driver = BrowserFactory.getBrowser(BROWSER_TYPE);
        }

        return driver;
    }

    public static void disposeDriver(){
        // closing the browser window
        driver.close();
        if (!BROWSER_TYPE.equals(BrowserType.FIREFOX)){
            // killing the WebDriver
            driver.quit();
        }
        // assign a null value to driver, as if it had never been initialized
        driver = null;
    }
}
