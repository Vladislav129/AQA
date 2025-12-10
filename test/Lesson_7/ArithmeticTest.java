package Lesson_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ArithmeticTest {

    Arithmetic arithmetic = new Arithmetic();

    @DisplayName("Проверка арифметичских значений")
    @ParameterizedTest
    @CsvSource({"5,5,10",
                "2,3,5",
                "25,15,40"})
    public void testAdd(int a, int b, int expected) {
        Assertions.assertEquals(a+b, expected);
    }

    @ParameterizedTest
    @CsvSource ({"5,5,0",
                "2,3,-1",
                "25,15,10"})
    public void testSub(int a, int b, int expected) {
        Assertions.assertEquals(a-b, expected);
    }

    @ParameterizedTest
    @CsvSource({"5,5,25",
    "2,3,6",
    "25,15,375"})
    public void testMul(int a, int b, int expected) {
        Assertions.assertEquals(a*b, expected);
    }

    @ParameterizedTest
    @CsvSource({"5,5,1",
    "2,3,0.66666",
    "25,15,1.66666"})
    public void testDiv(int a, int b, double expected) {
        Assertions.assertEquals(arithmetic.div(a, b), expected,0.0001);
    }

    @Test
    public void testDivisionByZero() {
        Exception exception =  Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arithmetic.div(10,0);
        });
        Assertions.assertEquals("Деление на 0 не допустимо", exception.getMessage());
    }
}
