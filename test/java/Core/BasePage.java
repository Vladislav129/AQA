package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver chromeDriver) {
        driver = chromeDriver;
    }
}
