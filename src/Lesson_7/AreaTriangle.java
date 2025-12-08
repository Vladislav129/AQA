package Lesson_7;

public class AreaTriangle {
    public double area (int a, int b, int c) {
        double pPerimetr=(double) (a+b+c)/2;
        double area = Math.sqrt(pPerimetr*(pPerimetr-a)*(pPerimetr-b)*(pPerimetr-c));
        return area;
    }
}