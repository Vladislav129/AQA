package Lesson_4_1;

interface Shape{
    double getArea();
    double getPerimeter();
    String getColorBorder();
    String getColorFill();
    }
    class Circle implements Shape{
    private double radius;
    private String colorFill;
    private String colorBorder;
    public Circle(double radius, String colorFill, String colorBorder){
        this.radius = radius;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
        }
        @Override
        public double getArea() {
            return Math.PI * Math.PI * radius;
        }
        @Override
        public double getPerimeter() {
            return Math.PI * radius * radius;
        }
        @Override
        public String getColorBorder(){
        return colorBorder;
        }
        @Override
        public String getColorFill(){
        return colorFill;
        }
    }
    class Rectangle implements Shape{
        private double width;
        private double height;
        private String colorFill;
        private String colorBorder;
        public Rectangle(double width, double height, String colorFill, String colorBorder){
            this.width = width;
            this.height = height;
            this.colorFill = colorFill;
            this.colorBorder = colorBorder;
        }
        @Override
        public double getArea() {
            return width * height;
        }
        @Override
        public double getPerimeter() {
            return 2*(width + height);
        }
        @Override
        public String getColorBorder(){
            return colorBorder;
        }
        @Override
        public String getColorFill(){
            return colorFill;
        }
    }
    class Triangle implements Shape{
        private double a;
        private double b;
        private double c;
        private String colorBorder;
        private String colorFill;
        public Triangle(double a, double b, double c, String colorBorder, String colorFill){
            this.a = a;
            this.b = b;
            this.c = c;
            this.colorBorder = colorBorder;
            this.colorFill = colorFill;
        }
        @Override
        public double getArea() {
            return Math.sqrt (getPerimeter()*(getPerimeter() - a)*(getPerimeter() - b)*(getPerimeter() - c)) ;
        }
        @Override
        public double getPerimeter() {
            return a + b + c;
        }
        @Override
        public String getColorBorder(){
            return colorBorder;
        }
        @Override
        public String getColorFill(){
            return colorFill;
        }
}

