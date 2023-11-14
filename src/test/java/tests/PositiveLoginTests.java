package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.FooterPage;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {

    @Test
    public void asUserLoginUsingValidData(){
        // enter the store
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        // click the Sign in button
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnSignInLink();
        // fill in the username and the password fields with incorrect data
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUsernameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickOnLogInBtn();
        // test is after login in the logo has been displayed
        FooterPage footerPage = new FooterPage(driver);
        assertTrue(footerPage.isBannerAfterLoginDisplayed());

    }

}
