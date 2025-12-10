package Lesson_7;

public class Factorial {

    public int add(int n){
        if (n<0) {
            throw new IllegalArgumentException("Факториал не определен");
        }
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}