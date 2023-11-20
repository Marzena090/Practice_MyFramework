package tests.waits;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.DriverManager;

import java.time.Duration;

public class WaitForElement {
    private static WebDriverWait getWebDriverWait(){
        // an instance of the WebDriverWait object with a timeout set to 10 seconds
        return new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(10));
    }

    public static void waitUntilElementVisible(WebElement element){
        WebDriverWait webDriverWait = getWebDriverWait();
        // wait, until WebElement will be visible in DOM
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementClickable(WebElement element){
        WebDriverWait webDriverWait = getWebDriverWait();
        // wait, until WebElement will be clickable
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
}


