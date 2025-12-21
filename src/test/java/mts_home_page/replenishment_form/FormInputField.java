package mts_home_page.replenishment_form;

import core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormInputField extends BaseTest {

    @FindBy (xpath = ".//input[@placeholder= 'Номер телефона']")
    WebElement inputPhone;

    @FindBy (id = "connection-sum")
    WebElement connectionSum;

    @FindBy (id = "connection-email")
    WebElement connectionEmail;

    @FindBy (xpath = "//input[@placeholder= 'Номер абонента']")
    WebElement internetPhone;

    @FindBy (id = "internet-sum")
    WebElement internetSum;

    @FindBy (id = "internet-email")
    WebElement internetEmail;

    @FindBy (id = "score-instalment")
    WebElement instalmentScore;

    @FindBy (id = "instalment-sum")
    WebElement instalmentSum;

    @FindBy (id = "instalment-email")
    WebElement instalmentEmail;

    @FindBy (id = "score-arrears")
    WebElement scoreArrears;

    @FindBy (id = "arrears-sum")
    WebElement arrearsSum;

    @FindBy (id = "arrears-email")
    WebElement arrearsEmail;

    public FormInputField(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getInputPhone() {
        return inputPhone.getAttribute("placeholder");
    }

    public String getConnectionSum() {
        return connectionSum.getAttribute("placeholder");
    }

    public String getConnectionEmail() {
        return connectionEmail.getAttribute("placeholder");
    }

    public String getInstalmentScore() {
        return instalmentScore.getAttribute("placeholder");
    }

    public String getInstalmentSum() {
        return instalmentSum.getAttribute("placeholder");
    }

    public String getInstalmentEmail() {
        return instalmentEmail.getAttribute("placeholder");
    }

    public String getInternetPhone() {
        return internetPhone.getAttribute("placeholder");
    }

    public String getInternetSum() {
        return internetSum.getAttribute("placeholder");
    }

    public String getInternetEmail() {
        return internetEmail.getAttribute("placeholder");
    }

    public String getScoreArrears() {
        return scoreArrears.getAttribute("placeholder");
    }

    public String getArrearsSum() {
        return arrearsSum.getAttribute("placeholder");
    }

    public String getArrearsEmail() {
        return arrearsEmail.getAttribute("placeholder");
    }
}
