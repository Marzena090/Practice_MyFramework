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

        LandingPage landingPage = new LandingPage();
        boolean isBannerAfterLoginDisplayed = landingPage.clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUsernameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLogInBtn()
                .isBannerAfterLoginDisplayed();

        assertTrue(isBannerAfterLoginDisplayed);

    }

}
