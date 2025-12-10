package Lesson_7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparisionTest {

    private final Comparison comparison = new Comparison();

    @Test(description = "проверка сравнений")
    public void testCompare() {
    int a = 1;
    int b = 2;
        Assert.assertTrue(Comparison.comparison(a,b));
    }
}
