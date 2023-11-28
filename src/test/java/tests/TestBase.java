package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import driver.DriverManager;
import driver.DriverUtils;

import static navigation.ApplicationURLs.APPLICATION_URL;

public class TestBase {
    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfig();
        DriverUtils.navigateToPage(APPLICATION_URL);

    }

    @AfterMethod
    public void afterTest() {
       DriverManager.disposeDriver();
    }
}
