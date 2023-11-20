package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.DriverManager;
import tests.waits.WaitForElement;

public class LandingPage {
    @FindBy(css = "#Content a")
    private WebElement enterStoreLink;

    public LandingPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnEnterStoreLink(){
        WaitForElement.waitUntilElementClickable(enterStoreLink);
        enterStoreLink.click();
    }
}
