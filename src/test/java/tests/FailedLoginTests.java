package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FailedLoginTests extends TestBase {

    @Test
    public void asUserTryToLogInWithInvalidData() {
        // enter the store
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        // click the Sign in button
        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();
        // fill in the username and the password fields with incorrect data
        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUsernameField("Koko30");
        loginPage.typeIntoPasswordField("Random123");
        loginPage.clickOnLogInBtn();
        // test if displayed text is correct
        String warningText = loginPage.getWarningMsg();
        assertEquals(warningText, "Invalid username or password. Signon failed.");
    }
}
