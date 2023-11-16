package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import tests.DriverManager;

public class TopMenuPage {
    @FindBy(linkText = "Sign In")
    private WebElement signInLink;

    public TopMenuPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnSignInLink(){
        signInLink.click();
    }
}
