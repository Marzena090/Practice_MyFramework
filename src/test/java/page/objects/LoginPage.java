package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.DriverManager;
import tests.waits.WaitForElement;

public class LoginPage {

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

    public void typeIntoUsernameField(String username){
        WaitForElement.waitUntilElementVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void typeIntoPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnLogInBtn(){

        loginBtn.click();
    }

    public String getWarningMsg(){
        WaitForElement.waitUntilElementVisible(messageLabel);
        String warningText = messageLabel.getText();
        return warningText;
    }


}
