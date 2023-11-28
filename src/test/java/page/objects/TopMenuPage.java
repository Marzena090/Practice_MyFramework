package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import driver.DriverManager;
import waits.WaitForElement;



public class TopMenuPage {
    private Logger logger = LogManager.getRootLogger();
    @FindBy(linkText = "Sign In")
    private WebElement signInLink;

    public TopMenuPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage clickOnSignInLink(){
        WaitForElement.waitUntilElementClickable(signInLink);
        signInLink.click();
        logger.info("Clicked on Sign In Link");
        return new LoginPage();
    }
}
