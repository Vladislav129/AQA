package Lesson_7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test(description = "проверка факториала")
    public void Factorial() {
        int a = 5;
        Assert.assertEquals(factorial.add(a), 120);
    }

    @Test(description = "проверка исключений факториала")
    public void FactorialException() {
        int a = -5;
        Exception exception = Assert.expectThrows(IllegalArgumentException.class, () -> factorial.add(a));
        Assert.assertEquals("Факториал не определен", exception.getMessage());
    }
}
