package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.time.Duration;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        driver = DriverManager.getWebDriver();
        // setting Implicit Wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // maximize the window
        driver.manage().window().maximize();
        // go to the store page
        driver.get("https://przyklady.javastart.pl/jpetstore/");
    }

    @AfterMethod
    public void afterTest() {
       DriverManager.disposeDriver();
    }
}
