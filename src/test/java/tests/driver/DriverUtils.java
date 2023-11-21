package tests.driver;

import tests.driver.DriverManager;

public class DriverUtils {
    public static void setInitialConfig(){
        // setting Implicit Wait for 10 seconds
        // DriverManager.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // maximize the window
        DriverManager.getWebDriver().manage().window().maximize();
    }

    public static void navigateToPage(String pageUrl){
        // go to the store page
        DriverManager.getWebDriver().get(pageUrl);
    }
}


