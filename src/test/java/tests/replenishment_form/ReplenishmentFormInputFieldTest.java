package tests.replenishment_form;

import constant.Constants;
import core.BaseTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import mts_home_page.replenishment_form.FormInputField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Тест формы онлайн пополенения")
@Feature("Форма онлайн пополнения")
public class ReplenishmentFormInputFieldTest extends BaseTest {

    @Story("Проверка полей вложенного текста окна 'Услуги связи'")
    @Description("Проверяются поля вложенного текста")
    @Test
    public void inputFieldServiceSelection(){
        FormInputField inputField = new FormInputField(driver);
        String actualPhone = inputField.getInputPhone();
        String actualSum = inputField.getConnectionSum();
        String actualEmail = inputField.getConnectionEmail();
        String expectedPhone = "Номер телефона";
        assertAll(
                () -> assertEquals(expectedPhone, actualPhone),
                () -> assertEquals(Constants.SUM, actualSum),
                () -> assertEquals(Constants.EMAIL, actualEmail)
        );
    }

    @Story("Проверка полей вложенного текста окна 'Домашний интернет'")
    @Description("Проверяются поля вложенного текста")
    @Test
    public void inputFieldServiceSelection2(){
        FormInputField inputField = new FormInputField(driver);
        String actualPhone = inputField.getInternetPhone();
        String actualSum = inputField.getInternetSum();
        String actualEmail = inputField.getInternetEmail();
        String expectedPhone = "Номер абонента";
        assertAll(
                () -> assertEquals(expectedPhone, actualPhone),
                () -> assertEquals(Constants.SUM, actualSum),
                () -> assertEquals(Constants.EMAIL, actualEmail)
        );
    }

    @Story("Проверка полей вложенного текста окна 'Рассрочка'")
    @Description("Проверяются поля вложенного текста")
    @Test
    public void inputFieldServiceSelection3(){
        FormInputField inputField = new FormInputField(driver);
        String actualScore = inputField.getInstalmentScore();
        String actualSum = inputField.getInstalmentSum();
        String actualEmail = inputField.getInternetEmail();
        String expectedScore = "Номер счета на 44";
        assertAll(
                () -> assertEquals(expectedScore, actualScore),
                () -> assertEquals(Constants.SUM, actualSum),
                () -> assertEquals(Constants.EMAIL, actualEmail)
        );
    }

    @Story("Проверка полей вложенного текста окна 'Задолжность'")
    @Description("Проверяются поля вложенного текста")
    @Test
    public void inputFieldServiceSelection4(){
        FormInputField inputField = new FormInputField(driver);
        String actualScore = inputField.getScoreArrears();
        String actualSum = inputField.getArrearsSum();
        String actualEmail = inputField.getArrearsEmail();
        String expectedScore = "Номер счета на 2073";
        assertAll(
                () -> assertEquals(expectedScore,actualScore),
                () -> assertEquals(Constants.SUM, actualSum),
                () -> assertEquals(Constants.EMAIL, actualEmail)
        );
    }
}
