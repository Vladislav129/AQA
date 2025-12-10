package Lesson_7;

public class Arithmetic {

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;

    }
    public double div(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Деление на 0 не допустимо");
        }
        double result = (double) a/b;
        return result;
    }
}
