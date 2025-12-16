package tests;

import core.BaseTest;
import testData.TestValue;
import mts_home_page.ReplenishmentForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlockOnlineReplenishmentTest extends BaseTest {

    @Test
    public void blockOnlineReplenishmentTest() {
        ReplenishmentForm form = new ReplenishmentForm(driver);
        String actualBlockName = form.getNameBlock();
        String expectedBlockName = "Онлайн пополнение без комиссии";
        Assertions.assertEquals(expectedBlockName, actualBlockName);
        Assertions.assertTrue(form.imgCards());

        form.clickService().inputData(TestValue.testPhone, TestValue.testSum, TestValue.testEmail);
    }
}

