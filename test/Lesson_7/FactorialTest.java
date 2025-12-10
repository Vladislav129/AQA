package Lesson_7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    private final Factorial factorial = new Factorial();

@DisplayName("Проверка факториала")
    @Test
    public void testFactorial() {
        int a = 0;
        int result = factorial.add(a);
        assertEquals(1, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3, -4})
    public void testFactorialExeption(int a) {
        Exception exeption = assertThrows(IllegalArgumentException.class, () -> {
            factorial.add(a);
        });
        assertEquals(exeption.getMessage(), "Факториал не определен");
    }
}
