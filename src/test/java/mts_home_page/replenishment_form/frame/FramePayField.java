package mts_home_page.replenishment_form.frame;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramePayField extends BaseTest {


    public FramePayField(WebDriver driver, WebDriverWait wait) {
        BaseTest.driver = driver;
        BaseTest.wait = wait;
        PageFactory.initElements(driver, this);
    }

    private void switchToFrame() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='bepaid-iframe']")));
    }

    public String getSum() {
        switchToFrame();
        WebElement sum = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//div[@class='pay-description__cost']//span[contains(text(),'BYN')]")));
        String text = sum.getText();
        return sum.getText().replace("BYN", "").trim();
    }

    public String getSumButton() {
        WebElement sumButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']//span")));
        return sumButton.getText().replace("Оплатить", "").replace("BYN", "").trim();
    }

    public String getNumber() {
        WebElement number = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Оплата:')]")));
        return number.getText().replace("Оплата: Услуги связи Номер:", "").trim();
    }

    public String getInputField() {
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//label[text() = 'Номер карты']")));
        return inputField.getText();
    }

    public String getInputField2() {
        WebElement inputField2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text() = 'Срок действия']")));
        return inputField2.getText();
    }

    public String getInputField3() {
        WebElement inputField3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='CVC']")));
        return inputField3.getText();
    }

    public String getInputField4() {
        WebElement inputField4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Имя и фамилия на карте']")));
        return inputField4.getText();
    }

    public boolean getIcon() {
        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src = 'assets/images/payment-icons/card-types/visa-system.svg']")));
        WebElement icon2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src = 'assets/images/payment-icons/card-types/mastercard-system.svg']")));
        WebElement icon3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src = 'assets/images/payment-icons/card-types/belkart-system.svg']")));
        WebElement iconMir = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src = 'assets/images/payment-icons/card-types/mir-system-ru.svg']")));
        WebElement iconMaster = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src = 'assets/images/payment-icons/card-types/maestro-system.svg']")));
        return icon.isDisplayed() &&
                icon2.isDisplayed() &&
                icon3.isDisplayed() &&
                iconMir.isDisplayed() &&
                iconMaster.isDisplayed();
    }
    public void exitFrame(){
        driver.switchTo().defaultContent();
    }
}