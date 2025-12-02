package Lesson_4;


import java.util.Arrays;

public class Cat extends Animals {
    private static final int MAX_RUN = 200;
    public static int countCats = 0;
    private boolean isHangry = false;
    public static Cat[] arrCat = new Cat[0];
    int portionEat;

    public Cat(String name, int portionEat) {
        super(name);
        this.portionEat = portionEat;
        arrCat = Arrays.copyOf(arrCat, arrCat.length + 1);
        arrCat[arrCat.length - 1] = this;
        countCats++;
    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun > MAX_RUN) {
            System.out.println(name + " не может пробежать " + distanceRun + "м");
        } else if (distanceRun <= MAX_RUN) {
            System.out.println(name + " пробежал " + distanceRun + "м");
        }
    }

    @Override
    public void swim(int distanceSwim) {
        System.out.println(name + " не умеет плавать");
    }

    public void eat(Bowl bowl) {
        if (isHangry) {
            System.out.println("Кот не голоден");
        }
        if (bowl.getFood() >= portionEat) {
            bowl.decrease(portionEat);
            isHangry = true;
            System.out.println("Кот " + name + " поел " + portionEat + " грамм еды и теперь сытый");
        }
        if (!isHangry) {
            System.out.println("В миске мало еды, кот " + name + " не стал есть");
        }
    }

    public void catInfo() {
        if (isHangry) {
            System.out.println("Кот " + name + " не голоден");
        }
        if (!isHangry) {
            System.out.println("Коту " + name + " нужно дать " + portionEat + " грамм еды, чтобы он поел");
        }
    }

    public String getName() {
        return name;
    }
}





