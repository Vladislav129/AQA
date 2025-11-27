package Lesson_4;
public class Main  {
    public static void main(String[] args) {
    Cat cat1 = new Cat("Барсик");
    Cat cat2 = new Cat("Мурзик");
    Dog dog1 = new Dog("Шарик");
    Bowl bowl = new Bowl (20);
   /* cat1.run(10);
    cat1.run(201);
    cat1.swim(20);
    dog1.run(10);
    dog1.run(501);
    dog1.swim(5);
    dog1.swim(40);
        System.out.println("Количество всех животных " + Animals.countAninmals);
        System.out.println("Количество котов " + Cat.countCats);
        System.out.println("Количество собак " + Dog.countDogs);*/
        cat1.eat(bowl);
        cat2.eat(bowl);
        bowl.addFood(30);
        cat2.eat(bowl);
        //bowl.info();
    }
}
