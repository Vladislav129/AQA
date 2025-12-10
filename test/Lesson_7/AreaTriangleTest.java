package Lesson_7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AreaTriangleTest {

    private final AreaTriangle triangle = new AreaTriangle();

    @DataProvider(name = "Triangle")
    public Object[][] triangle() {
        return new Object[][] {
                {5,6,7, 14.6969},
                {10,15,15,70.7106},
                {3,4,5,6.0}
        };
    }

    @Test(dataProvider = "Triangle" , description = "Проверка площади треугольника")
    public void areaTriangle(int a, int b, int c, double expected) {
        double result = triangle.area(a, b, c);
        assertEquals(result, expected, 0.0001);
    }
}
