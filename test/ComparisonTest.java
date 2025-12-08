import Lesson_7.Comparison;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComparisonTest {
    private final Comparison comparison = new Comparison();
    @DisplayName("Проверка сравнения")
    @Test
    public void ComparisonTest() {
        int a = 5;
        int b = 10;
        Assertions.assertTrue(Comparison.comparison(a,b));

    }
}
