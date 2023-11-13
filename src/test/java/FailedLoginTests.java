import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FailedLoginTests {

    private WebDriver driver;

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

    @Test
    public void asUserTryToLogInWithIncorrectData() {
        // enter the store
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        // click the Sign in button
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnSignInLink();
        // fill in the username and the password fields with incorrect data
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUsernameField("Koko30");
        loginPage.typeIntoPasswordField("Random123");
        loginPage.clickOnLogInBtn();
        // test if displayed text is correct
        String warningText = loginPage.getWarningMsg();
        assertEquals(warningText, "Invalid username or password. Signon failed.");
    }

    @AfterMethod
    public void afterTest() {
        // closing the browser window
        driver.close();
        // killing the WebDriver
        driver.quit();
    }
}
