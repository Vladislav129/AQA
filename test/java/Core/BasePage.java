package Core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {

    protected static WebDriver driver;

    public static void setDriver(WebDriver chromeDriver) {
        driver = chromeDriver;
    }
}
