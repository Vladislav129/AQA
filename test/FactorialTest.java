import Lesson_7.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        int a = 5;
        int result = factorial.add(a);
        assertEquals(120, result);
    }
}
