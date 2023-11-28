package tests;

import driver.DriverUtils;

import org.testng.annotations.Test;
import page.objects.LoginPage;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {

    @Test
    public void asUserLoginUsingValidData(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        boolean isBannerAfterLoginDisplayed = loginPage.typeIntoUsernameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLogInBtn()
                .isBannerAfterLoginDisplayed();

        assertTrue(isBannerAfterLoginDisplayed);

    }

}
