package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getBrowser(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                // setting the path to Chrome's WebDriver
                System.setProperty("webdriver.chrome.driver", "C:/Users/marze/Documents/chromedriver.exe");
                // ChromeDriver initialization
                return new ChromeDriver();
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "C:/Users/marze/Documents/geckodriver.exe");
                return new FirefoxDriver();
            case EDGE:
                System.setProperty("webdriver.edge.driver", "C:/Users/marze/Documents/msedgedriver.exe");
                return new EdgeDriver();
            default:
                throw new IllegalStateException("Unknown browser type! Please check your configuration");
        }
    }
}
