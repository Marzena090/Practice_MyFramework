import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement bannerAfterLogin;

    private WebDriver driver;

    // constructor
    public FooterPage(WebDriver driver) {
        this.driver = driver;
        // init web elements
        PageFactory.initElements(driver,this);
    }

    public boolean isBannerAfterLoginDisplayed(){
        boolean isDisplayed = bannerAfterLogin.isDisplayed();
        return isDisplayed;
    }

}
