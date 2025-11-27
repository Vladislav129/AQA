package Lesson_4;

public class Dog extends Animals {
    private static final int MAX_RUN = 500;
    private static final int MAX_SWIM = 10;
    public static int countDogs = 0;
    public Dog(String name) {
        super(name);
        countDogs++;
    }
    @Override
    public void run(int distanceRun) {
        if(distanceRun > MAX_RUN) {
            System.out.println(name + " не может пробежать " + distanceRun + "м");
        }
        else if(distanceRun <= MAX_RUN) {
            System.out.println(name + " пробежал " + distanceRun+ "м" );
        }
    }
    @Override
    public void swim(int distanceSwim) {
        if(distanceSwim > MAX_SWIM) {
            System.out.println(name + " не может проплыть " + distanceSwim + "м");
        }
        else if(distanceSwim <= MAX_SWIM) {
            System.out.println(name + " проплыл " + distanceSwim + "м");
        }
    }
}
