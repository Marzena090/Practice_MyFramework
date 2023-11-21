package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.driver.DriverManager;
import tests.waits.WaitForElement;

public class FooterPage {

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement bannerAfterLogin;

    // constructor
    public FooterPage() {
        // init web elements
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public boolean isBannerAfterLoginDisplayed(){
        WaitForElement.waitUntilElementVisible(bannerAfterLogin);
        boolean isDisplayed = bannerAfterLogin.isDisplayed();
        return isDisplayed;
    }

}
