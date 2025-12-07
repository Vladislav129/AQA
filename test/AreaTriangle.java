import Lesson_7.AreaTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaTriangleTest {
    @Test
    public void testAreaTriangle() {
        AreaTriangle areaTriangle = new AreaTriangle();
        int a = 1;
        int b = 2;
        int c = 3;
        int pPerimetr = (a+b+c)/2;
        int area = pPerimetr*(pPerimetr-a)*(pPerimetr-b)*(pPerimetr-c);
        int result = areaTriangle.area(a, b, c);
        assertEquals(0, result);
    }
}