package Lesson_4;

public class Cat extends Animals {
    private static final int MAX_RUN = 200;
    public static int countCats = 0;
    private boolean isHangry = false;
    private static final int PORTION_EAT = 20;
    public Cat(String name) {
        super(name);
        countCats++;
    }
    @Override
    public void run(int distanceRun) {
        if(distanceRun > MAX_RUN) {
            System.out.println(name + " не может пробежать "+ distanceRun + "м");
        }
        else if(distanceRun <= MAX_RUN) {
            System.out.println(name + " пробежал " + distanceRun + "м");
        }
    }
    @Override
    public void swim(int distanceSwim) {
        System.out.println(name + " не умеет плавать");
    }
    public void eat(Bowl bowl) {
        if(isHangry) {
            System.out.println("Кот не голоден");
        }
        if (bowl.getFood() >= PORTION_EAT ) {
            bowl.decrease(PORTION_EAT);
            isHangry = true;
            System.out.println("Кот " + name + " поел " + PORTION_EAT + " грамм еды и теперь сытый");
        }
        if(!isHangry) {
            System.out.println("В миске мало еды, кот " + name + " не стал есть");
        }
    }
}
