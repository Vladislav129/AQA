package Lesson_3;

public class Product {
    String name;
    String manufacturerDate;
    String manufacturer;
    String countryOfOrigin;
    double price;
    boolean reservation;
    public Product(String name, String manufacturerDate, String manufacturer, String countryOfOrigin, double price, boolean reservation) {
        this.name = name;
        this.manufacturerDate = manufacturerDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.reservation = reservation;
    }
    public void info (){
        System.out.println("Имя: " + name);
        System.out.println("Дата производств: " + manufacturerDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Бронирование: " + reservation);
    }
    public static void productArray (){
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 1299.99, true);
        productsArray[1] = new Product("Iphone 17", "10.10.2025", "Apple Inc.", "India", 799, false);
        productsArray[2] = new Product("Iphone 17 Pro", "01.10.2025", "Apple Inc.", "USA", 1099, false);
        productsArray[3] = new Product("Pixel 10", "14.09.2025", "Google LLC", "China", 799, true);
        productsArray[4] = new Product("Huawei Mate XT", "18.02.2025", "Huawei Technologies Co. Ltd", "China", 2835, false);
        for (Product product : productsArray) {
            product.info();
        }
    }
}
