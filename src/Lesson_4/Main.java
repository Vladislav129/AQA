package Lesson_4;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
    Cat cat1 = new Cat("Барсик",20);
    Cat cat2 = new Cat("Мурзик", 40);
    Dog dog1 = new Dog("Шарик");
    Cat cat3 = new Cat ("Маруся", 20);
    Cat cat4 = new Cat ("Тим", 35);
    Bowl bowl = new Bowl (80);
    cat1.run(10);
    cat1.run(201);
    cat1.swim(20);
    dog1.run(10);
    dog1.run(501);
    dog1.swim(5);
    dog1.swim(40);
        System.out.println("Количество всех животных " + Animals.countAninmals);
        System.out.println("Количество котов " + Cat.countCats);
        System.out.println("Количество собак " + Dog.countDogs);
        cat1.catInfo();
        cat2.catInfo();
        bowl.info();
        cat1.eat(bowl);
        cat1.catInfo();
        bowl.addFood(30);
        cat2.eat(bowl);
        bowl.addFood(30);
        cat2.eat(bowl);
        bowl.info();
        for (int i = 0; i < Cat.arrCat.length; i++) {
            System.out.println(Cat.arrCat[i].getName());
        }
        for (int i = 0; i < Cat.arrCat.length; i++) {
            Cat.arrCat[i].eat(bowl);
            System.out.println();
        }
        for (int i = 0; i < Cat.arrCat.length; i++) {
            Cat.arrCat[i].catInfo();
            System.out.println();
        }
    }
}
