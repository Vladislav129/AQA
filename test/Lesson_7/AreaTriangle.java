package Lesson_7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaTriangleTest {

    private final AreaTriangle areaTriangle = new AreaTriangle();
    @DisplayName("Проверка формулы площади треугольника")
    @Test
    public void testAreaTriangle() {
        int a = 5;
        int b = 5;
        int c = 6;
        assertEquals(12, areaTriangle.area(a,b,c));
    }

    @ParameterizedTest
    @CsvSource({"2,4,5,3.799671038392666",
            "5,5,6,12.0",
            "7,12,16,38.93504205725223"
    })
    public void testAreaTriangle2(int a, int b, int c, double result) {
        assertEquals(result, areaTriangle.area(a,b,c));

    }
}