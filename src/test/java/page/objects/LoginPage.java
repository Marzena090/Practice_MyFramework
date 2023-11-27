package page.objects;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.driver.DriverManager;
import tests.waits.WaitForElement;

public class LoginPage {
    private Logger logger = LogManager.getRootLogger();

    @FindBy(name= "username")
    private WebElement usernameField;

    @FindBy(name="password")
    private WebElement passwordField;

    @FindBy(name="signon")
    private WebElement loginBtn;

    @FindBy(css="#Content ul[class='messages'] li")
    private WebElement messageLabel;

    public LoginPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage typeIntoUsernameField(String username){
        WaitForElement.waitUntilElementVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(username);
        logger.info("Typed into Username Field {}", username);
        return this;
    }

    public LoginPage typeIntoPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password Field {}", password);
        return this;
    }

    public FooterPage clickOnLogInBtn(){
        loginBtn.click();
        logger.info("Clicked on Login Button");
        return new FooterPage();
    }

    public String getWarningMsg(){
        WaitForElement.waitUntilElementVisible(messageLabel);
        String warningText = messageLabel.getText();
        logger.info("Returned warning message was: {}", warningText);
        return warningText;
    }


}
