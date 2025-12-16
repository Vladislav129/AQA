package mts_home_page;

import core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReplenishmentForm extends BaseTest {
    private WebDriver driver;

    @FindBy(xpath = "//h2[contains(.,'Онлайн пополнение') and contains(.,'без комиссии')]")
    private WebElement nameBlock;

    @FindBy(xpath = "//img[@alt ='Visa']")
    private WebElement imgVisa;

    @FindBy(xpath = "//img[@alt ='Verified By Visa']")
    private WebElement imgVerifiedVisa;

    @FindBy(xpath = "//section[@class='pay']//img[@alt='MasterCard']")
    private WebElement imgMasterCard;

    @FindBy(xpath = "//img[@alt='MasterCard Secure Code']")
    private WebElement imgMasterCardSecureCode;

    @FindBy(xpath = "//section[@class='pay']//img[@alt='Белкарт']")
    private WebElement imgBelcard;

    @FindBy(xpath = "//section[@class='pay']//a")
    private WebElement moreService;

    @FindBy(id = "connection-phone")
    private WebElement connectionPhone;

    @FindBy(id = "connection-sum")
    private WebElement connectionSum;

    @FindBy(id = "connection-email")
    private WebElement connectionEmail;

    @FindBy(xpath = "//button[contains(text(), 'Продолжить')]")
    private WebElement buttonContinue;

    public ReplenishmentForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getNameBlock() {
        return nameBlock.getText()
                .replace("\n", " ")
                .trim();
    }

    public boolean imgCards() {
        return imgVisa.isDisplayed() &&
                imgVerifiedVisa.isDisplayed() &&
                imgMasterCard.isDisplayed() &&
                imgMasterCardSecureCode.isDisplayed() &&
                imgBelcard.isDisplayed();
    }

    public ReplenishmentForm clickService() {
        moreService.click();
        driver.navigate().back();
        return this;
    }

    public ReplenishmentForm inputData(String phone, String sum, String email) {
        connectionPhone.click();
        connectionPhone.sendKeys(phone);
        connectionSum.click();
        connectionSum.sendKeys(sum);
        connectionEmail.click();
        connectionEmail.sendKeys(email);
        buttonContinue.click();
        return this;
    }
}
