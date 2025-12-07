package Lesson_7;

public class AreaTriangle {
    public int area (int a, int b, int c) {
        int pPerimetr= (a+b+c)/2;
        int area = pPerimetr*(pPerimetr-a)*(pPerimetr-b)*(pPerimetr-c);
        return area;
    }
}
