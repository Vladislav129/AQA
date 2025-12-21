package tests.replenishment_form;

import constant.Constants;
import core.BaseTest;

import org.junit.jupiter.api.Assertions;
import mts_home_page.replenishment_form.FormInputField;
import org.junit.jupiter.api.Test;


public class ReplenishmentFormInputFieldTest extends BaseTest {

    @Test
    public void inputFieldServiceSelection(){
        FormInputField inputField = new FormInputField(driver);
        String actualPhone = inputField.getInputPhone();
        String actualSum = inputField.getConnectionSum();
        String actualEmail = inputField.getConnectionEmail();
        String expectedPhone = "Номер телефона";
        Assertions.assertEquals(expectedPhone, actualPhone);
        Assertions.assertEquals(Constants.SUM, actualSum);
        Assertions.assertEquals(Constants.EMAIL, actualEmail);
    }
    @Test
    public void inputFieldServiceSelection2(){
        FormInputField inputField = new FormInputField(driver);
        String actualPhone = inputField.getInternetPhone();
        String actualSum = inputField.getInternetSum();
        String actualEmail = inputField.getInternetEmail();
        String expectedPhone = "Номер абонента";
        Assertions.assertEquals(expectedPhone, actualPhone);
        Assertions.assertEquals(Constants.SUM, actualSum);
        Assertions.assertEquals(Constants.EMAIL, actualEmail);
    }

    @Test
    public void inputFieldServiceSelection3(){
        FormInputField inputField = new FormInputField(driver);
        String actualScore = inputField.getInstalmentScore();
        String actualSum = inputField.getInstalmentSum();
        String actualEmail = inputField.getInternetEmail();
        String expectedScore = "Номер счета на 44";
        Assertions.assertEquals(expectedScore, actualScore);
        Assertions.assertEquals(Constants.SUM, actualSum);
        Assertions.assertEquals(Constants.EMAIL, actualEmail);
    }

    @Test
    public void inputFieldServiceSelection4(){
        FormInputField inputField = new FormInputField(driver);
        String actualScore = inputField.getScoreArrears();
        String actualSum = inputField.getArrearsSum();
        String actualEmail = inputField.getArrearsEmail();
        String expectedScore = "Номер счета на 2073";
        Assertions.assertEquals(expectedScore, actualScore);
        Assertions.assertEquals(Constants.SUM, actualSum);
        Assertions.assertEquals(Constants.EMAIL, actualEmail);
    }
}
