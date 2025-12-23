package mts_home_page.replenishment_form.frame;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramePayField {

    private WebDriverWait wait;
    private WebDriver driver;

    public FramePayField(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void switchToFrame() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='bepaid-iframe']")));
    }

    @Step("Нахождение суммы оплаты")
    public String getSum() {
        WebElement sum = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//div[@class='pay-description__cost']//span[contains(text(),'BYN')]")));
        String text = sum.getText();
        return sum.getText().replace("BYN", "").trim();
    }

    @Step("Нахождение суммы оплаты на кнопке 'Оплатить' ")
    public String getSumButton() {
        WebElement sumButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']//span")));
        return sumButton.getText().replace("Оплатить", "").replace("BYN", "").trim();
    }

    @Step("Нахождение номера телефона")
    public String getNumber() {
        WebElement number = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Оплата:')]")));
        return number.getText().replace("Оплата: Услуги связи Номер:", "").trim();
    }

    @Step("Нахождение вложенного текста в первом поле ввода")
    public String getInputField() {
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//label[text() = 'Номер карты']")));
        return inputField.getText();
    }

    @Step("Нахождение вложенного текста во втром поле ввода")
    public String getInputField2() {
        WebElement inputField2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text() = 'Срок действия']")));
        return inputField2.getText();
    }

    @Step("Нахождение вложенного текста в третьем поле ввода")
    public String getInputField3() {
        WebElement inputField3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='CVC']")));
        return inputField3.getText();
    }

    @Step("Нахождение вложенного текста в четвертом поле ввода")
    public String getInputField4() {
        WebElement inputField4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Имя и фамилия на карте']")));
        return inputField4.getText();
    }

    @Step("Нахождение иконок банковских карт")
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