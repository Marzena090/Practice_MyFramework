package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;
import waits.WaitForElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LandingPage {
    private Logger logger = LogManager.getRootLogger();
    @FindBy(css = "#Content a")
    private WebElement enterStoreLink;

    public LandingPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public TopMenuPage clickOnEnterStoreLink(){
        WaitForElement.waitUntilElementClickable(enterStoreLink);
        enterStoreLink.click();
        logger.info("Clicked on Enter Store link");
        return new TopMenuPage();
    }
}
