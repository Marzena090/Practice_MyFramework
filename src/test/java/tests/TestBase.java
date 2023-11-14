package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        // setting the path to Chrome's WebDriver
        System.setProperty("webdriver.chrome.driver", "C:/Users/marze/Documents/chromedriver.exe");
        // ChromeDriver initialization
        driver = new ChromeDriver();
        // setting Implicit Wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // go to the store page
        driver.get("https://przyklady.javastart.pl/jpetstore/");
    }

    @AfterMethod
    public void afterTest() {
        // closing the browser window
        driver.close();
        // killing the WebDriver
        driver.quit();
    }
}
