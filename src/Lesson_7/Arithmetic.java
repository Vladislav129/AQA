package Lesson_7;

public class Arithmetic {
    public static int add(int a, int b){

        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static double div(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Деление на 0 не допустимо");
        }
        double result = (double) a/b;
        return result;
    }
}