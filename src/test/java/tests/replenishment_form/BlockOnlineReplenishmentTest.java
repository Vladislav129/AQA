package tests.replenishment_form;

import core.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import testData.TestValue;
import mts_home_page.replenishment_form.Form;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
@Epic("Тест формы онлайн пополенения")
@Feature("Форма онлайн пополнения")
public class BlockOnlineReplenishmentTest extends BaseTest {

    private Form form;

    @Story("Провека на валидность текста 'Онлайн пополнение без комиссии'")
    @Description("Проверяется текст оналайн пополнение без комиссии")
    @Test
    public void blockOnlineReplenishmentTest() {
        form = new Form(driver);
        String actualBlockName = form.getNameBlock();
        String expectedBlockName = "Онлайн пополнение без комиссии";
        Assertions.assertEquals(expectedBlockName, actualBlockName);
    }

    @Story("Проверка на наличии иконок банковских карт" )
    @Description("Проверяется наличии иконок банковских карт")
    @Test
    public void blockOnlineReplenishmentTest2() {
        form = new Form(driver);
        Assertions.assertTrue(form.imgCards());
    }

    @Story("Проверка кликабельности подробнее о сервисе")
    @Description("Проверяется кликабельность подробнее о сервисе")
    @Test
    public void blockOnlineReplenishmentTest3() {
        form = new Form(driver);
        form.clickService();
    }

    @Story("Проверка кнопки продолжить")
    @Description("Заполняются данные и проверяется кнопка продолжить на кликабельность")
    @Test
    public void blockOnlineReplenishmentTest4() {
        form = new Form(driver);
        form.inputData(TestValue.testPhone, TestValue.testSum, TestValue.testEmail);
    }
}

