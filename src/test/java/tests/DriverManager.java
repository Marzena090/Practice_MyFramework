package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;


    // constructor
    private DriverManager() {
    }

    // method that returns us a new instance of
    // WebDriver if the driver has not been initialized before - null
    public static WebDriver getWebDriver() {

        if (driver == null) {
            // setting the path to Chrome's WebDriver
            System.setProperty("webdriver.chrome.driver", "C:/Users/marze/Documents/chromedriver.exe");
            // ChromeDriver initialization
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void disposeDriver(){
        // closing the browser window
        driver.close();
        // killing the WebDriver
        driver.quit();
        // assign a null value to driver, as if it had never been initialized
        driver = null;
    }
}
