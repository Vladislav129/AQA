package Lesson_4_1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(4, "Синий", "Черный");
        Shape rectangle = new Rectangle(10, 23, "Зеленый", "Желтый");
        Shape triangle = new Triangle(5,10,10,"Белый", "Фиолетовый");
        System.out.println("Круг: площадь " + circle.getArea() + " | периметр " + circle.getPerimeter() +
                " | цвет границы "+ circle.getColorBorder() + " | цвет заливки " + circle.getColorFill());
        System.out.println("Прямоугольник: площадь " + rectangle.getArea() + " | периметр " + rectangle.getPerimeter() +
                " | цвет границы " + rectangle.getColorBorder() + " | цвет заливки " + rectangle.getColorFill());
        System.out.println("Триугольник: площадь: " + triangle.getArea() + " | периметр " + triangle.getPerimeter()
        + " | цвет границы " + triangle.getColorBorder() + " | цвет заливки " + triangle.getColorFill());
    }
}
