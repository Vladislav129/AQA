package Lesson_7;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AriphmeticTest {

    private final Arithmetic arithmetic = new Arithmetic();

    @DataProvider(name = "Data")
    public Object[][] ariphmetic() {
        return new Object[][]{
                {5, 5, 10, 0, 25, 1},
                {4, 7, 11, -3, 28, 0.5714}
        };
    }

    @Test(description = "Ошибочное сложение",alwaysRun = true)
    public void ariphmeticAddFalse() {
        Assert.assertEquals(arithmetic.add(5,5),5);
    }

    @Test(description = "проверка сложения", dataProvider = "Data")
    public void arithmeticAdd(int a, int b, int expectedAdd, int expectedSub, int expectedMul, double expectedDiv) {
        int result = Arithmetic.add(a, b);
        Assert.assertEquals(result, expectedAdd);
    }

    @Test(description = "проверка вычетания", dataProvider = "Data")
    public void arithmeticSub(int a, int b, int expectedAdd, int expectedSub, int expectedMul, double expectedDiv) {
        int result = Arithmetic.sub(a, b);
        Assert.assertEquals(result, expectedSub);
    }

    @Test(description = "проверка умножения", dataProvider = "Data")
    public void arithmeticMul(int a, int b, int expectedAdd, int expectedSub, int expectedMul, double expectedDiv) {
        int result = Arithmetic.mul(a, b);
        Assert.assertEquals(result, expectedMul);
    }

    @Test(description = "проверка деления", dataProvider = "Data")
    public void arithmeticDiv(int a, int b, int expectedAdd, int expectedSub, int expectedMul, double expectedDiv) {
        double result = Arithmetic.div(a, b);
        Assert.assertEquals(result, expectedDiv,0.0001);
    }

    @Test(description = "Проверка исключения деления на 0")
    public void arithmeticDivZero() {
        Exception exception = Assert.expectThrows(
                IllegalArgumentException.class,
                () -> Arithmetic.div(15, 0)
        );
        Assert.assertEquals("Деление на 0 не допустимо", exception.getMessage());
    }
}
