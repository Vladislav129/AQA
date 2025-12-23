package tests.replenishment_form.frame;

import constant.Constants;
import core.BaseTest;
import io.qameta.allure.*;
import mts_home_page.replenishment_form.frame.FramePayField;
import mts_home_page.replenishment_form.Form;
import org.junit.jupiter.api.*;
import testData.TestValue;
import org.junit.jupiter.api.TestInstance;

import static core.Screenshot.attachScreenshot;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Epic("Тест всплывающего окна оплаты")
@Feature("Окно оплаты")
public class FramePayFieldTest extends BaseTest {

    private Form form;
    private FramePayField frame;

    @BeforeEach
    @Step("Заполнение данных для перехода в окно оплаты")
    public void inputFrame() {
        form = new Form(driver);
        frame = new FramePayField(driver, wait);
        form.inputData(TestValue.testPhone, TestValue.testSum, TestValue.testEmail);
        frame.switchToFrame();
    }

    @Story("Проверка корректности введенных сумм")
    @Description("Проверяется соответствие суммы в поле и на кнопке оплаты")
    @Test
    public void testFramePaySum() {
        assertAll(
                () -> assertEquals(TestValue.testSum, frame.getSum()),
                () -> assertEquals(TestValue.testSum, frame.getSumButton()));
        attachScreenshot(driver);
    }

    @Story("Проверка корректности введенного номера телефона")
    @Description("Проверяется соответстиве введенного номера телефона")
    @Test
    public void testFramePayPhone() {
        assertEquals(TestValue.codeCount + TestValue.testPhone, frame.getNumber());
    }

    @Story("Проверка вложенного текста в формах ввода")
    @Description("Проверяется соответстиве вложенного текста в форме ввода")
    @Test
    public void testFramePayField() {
        assertAll(
                () -> assertEquals(Constants.NUM_CARD, frame.getInputField()),
                () -> assertEquals(Constants.PERIOD, frame.getInputField2()),
                () -> assertEquals(Constants.CVC, frame.getInputField3()),
                () -> assertEquals(Constants.NAME_CARD, frame.getInputField4())
        );
    }

    @Story("Проверка наличия иконок банковских карт")
    @Description("Проверяется отображение икнонок бакновских карт")
    @Test
    public void testFramePayIcons() {
        Assertions.assertTrue(frame.getIcon(), "icon bankCard Validation");
    }

    @Step("Выход из окна оплаты")
    @AfterEach
    public void closeFrame() {
        frame.exitFrame();
    }
}