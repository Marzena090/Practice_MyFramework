package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;
import waits.WaitForElement;

public class FooterPage {
    private Logger logger = LogManager.getRootLogger();
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
        logger.info("Returning status of banner after login: {}", isDisplayed);
        return isDisplayed;
    }

}
