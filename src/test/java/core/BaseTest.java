package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static core.Screenshot.attachScreenshot;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;


    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.mts.by/");
        try{
            WebElement elementCookie = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'btn btn_black cookie__ok']")));
            elementCookie.click();
        }catch(Exception e){
            System.out.println("Куки не найден");
        }
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
