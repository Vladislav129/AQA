package Lesson_3;

public class Park {
    public static class InfoAttraction {
        String name;
        String location;
        int minPeople;
        int maxPeople;
        int acceptebleAge;
        String workTime;
        double price;

        public InfoAttraction(String name, String location, int minPeople, int maxPeople, int acceptebleAge, String workTime, double price) {
            this.name = name;
            this.location = location;
            this.minPeople = minPeople;
            this.maxPeople = maxPeople;
            this.acceptebleAge = acceptebleAge;
            this.workTime = workTime;
            this.price = price;
        }

        public void info() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Местополажение аттракциона: " + location);
            System.out.println("Минимальное количество людей: " + minPeople);
            System.out.println("Максимальное количество людей: " + maxPeople);
            System.out.println("Допустимый возвраст: " + acceptebleAge);
            System.out.println("Время работы аттракциона: " + workTime);
            System.out.println("Цена: " + price);
        }
    }

    InfoAttraction infoAttraction;
    String namePark;
    String locationPark;
    String workTimePark;

    public Park(String namePark, String locationPark, String workTimePark, InfoAttraction infoAttraction) {
        this.namePark = namePark;
        this.locationPark = locationPark;
        this.workTimePark = workTimePark;
        this.infoAttraction = infoAttraction;
    }

    public void printPark() {
        System.out.println("Название парка: " + namePark);
        System.out.println("Адрес парка: " + locationPark);
        System.out.println("Время работы парка: " + workTimePark);
        System.out.println();
        infoAttraction.info();
    }
    public static void infoPark() {
        InfoAttraction attraction = new InfoAttraction(
                "Карусель", "Зона С", 2, 15, 12, "10:00 - 20:00", 200
        );

        Park park1 = new Park("Диснейленд", "Лондон", "9:00 - 24:00", attraction);

        park1.printPark();
    }
}
