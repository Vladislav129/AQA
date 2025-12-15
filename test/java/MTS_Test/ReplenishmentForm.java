package MTS_Test;

import Core.SettingTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReplenishmentForm extends SettingTest {

    @FindBy(xpath = "//h2[contains(.,'Онлайн пополнение') and contains(.,'без комиссии')]")
    private WebElement nameBlock;

    @FindBy(xpath = "//img[@alt ='Visa']")
    private WebElement imgVisa;

    @FindBy(xpath = "//img[@alt ='Verified By Visa']")
    private WebElement imgVerifiedVisa;

    @FindBy(xpath = "//section[@class='pay']//img[@alt='MasterCard']")
    private WebElement imgMasterCard;

    @FindBy (xpath = "//img[@alt='MasterCard Secure Code']")
    private WebElement imgMasterCardSecureCode;

    @FindBy (xpath = "//section[@class='pay']//img[@alt='Белкарт']")
    private WebElement imgBelcard;

    @FindBy (xpath = "//section[@class='pay']//a")
    private WebElement moreService;

    @FindBy (id = "connection-phone")
    private WebElement connectionPhone;

    @FindBy (id = "connection-sum")
    private WebElement connectionSum;

    @FindBy (id = "connection-email")
    private WebElement connectionEmail;

    @FindBy (xpath = "//button[contains(text(), 'Продолжить')]")
    private WebElement buttonContinue;

    public ReplenishmentForm() {
        driver.get("https://www.mts.by/");
        try{
            driver.findElement(By.xpath("//button[contains(text(),'Принять')]")).click();
        }catch(Exception e){
            System.out.println("Куки не найден");
        }
        PageFactory.initElements(driver, this);
    }

    @Test
    public void checkNameBlock(){
        String expectedName = "Онлайн пополнение без комиссии";
        String actualName = nameBlock.getText().replace("\n"," ").trim();
        System.out.println(actualName);
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void checkImg(){
        Assertions.assertTrue(imgVisa.isDisplayed());
        Assertions.assertTrue(imgVerifiedVisa.isDisplayed());
        Assertions.assertTrue(imgMasterCard.isDisplayed());
        Assertions.assertTrue(imgBelcard.isDisplayed());
    }

    @Test
    public void checkMoreService(){
        moreService.click();
        driver.navigate().back();
    }

    @Test
    public void checkFieldsReplenishment(){
        String phone = "297777777";
        String sum = "15";
        String email = "testemail@mail.ru";
        connectionPhone.click();
        connectionPhone.sendKeys(phone);
        connectionSum.click();
        connectionSum.sendKeys(sum);
        connectionEmail.click();
        connectionEmail.sendKeys(email);
        buttonContinue.click();
    }
}
