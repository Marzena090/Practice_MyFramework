package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.time.Duration;

public class TestBase {
    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfig();
        DriverUtils.navigateToPage("http://przyklady.javastart.pl/jpetstore/");

    }

    @AfterMethod
    public void afterTest() {
       DriverManager.disposeDriver();
    }
}
