package MTS_Test;

import Core.SettingTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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

    public ReplenishmentForm() {
        driver.get("https://www.mts.by/");
        PageFactory.initElements(driver, this);
    }

    @Test
    public void checkNameBlock(){
        String expectedName = "Онлайн пополнение без комиссии";
        String actualName = nameBlock.getText().replace("\n"," ").trim();
        System.out.println(actualName);
        Assertions.assertEquals(expectedName, actualName);
    }
}
