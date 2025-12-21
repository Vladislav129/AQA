package tests.replenishment_form.frame;

import constant.Constants;
import core.BaseTest;
import mts_home_page.replenishment_form.frame.FramePayField;
import mts_home_page.replenishment_form.Form;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testData.TestValue;

public class FramePayFieldTest extends BaseTest {

    @Test
    public void testFramePayField(){
        FramePayField frame = new FramePayField(driver, wait);
        Form form = new Form(driver);
        form.inputData(TestValue.testPhone, TestValue.testSum, TestValue.testEmail);
        Assertions.assertEquals(TestValue.testSum,frame.getSum());
        Assertions.assertEquals(TestValue.testSum,frame.getSumButton());
        Assertions.assertEquals(TestValue.codeCount+TestValue.testPhone,frame.getNumber());
        Assertions.assertEquals(Constants.NUM_CARD,frame.getInputField());
        Assertions.assertEquals(Constants.PERIOD, frame.getInputField2());
        Assertions.assertEquals(Constants.CVC,frame.getInputField3());
        Assertions.assertEquals(Constants.NAME_CARD,frame.getInputField4());
        Assertions.assertTrue(frame.getIcon());
        frame.exitFrame();
    }
}
