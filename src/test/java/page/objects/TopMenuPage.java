package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class TopMenuPage {
    private WebDriver driver;

    @FindBy(linkText = "Sign In")
    private WebElement signInLink;

    public TopMenuPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSignInLink(){
        signInLink.click();
    }
}
