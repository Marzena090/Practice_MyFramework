import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenuPage {
    private WebDriver driver;

    public TopMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnSignInLink(){
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();
    }
}
