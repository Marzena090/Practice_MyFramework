package tests;

import driver.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;


public class FailedLoginTests extends TestBase {

    @Test
    public void asUserTryToLogInWithInvalidData() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage
                .typeIntoUsernameField("Koko30")
                .typeIntoPasswordField("Random123")
                .clickOnLogInBtn();


        // test if displayed text is correct
        String warningText = loginPage.getWarningMsg();
        assertEquals(warningText, "Invalid username or password. Signon failed.");
    }
}
