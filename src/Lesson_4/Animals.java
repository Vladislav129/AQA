package Lesson_4;

public abstract class Animals {
    String name;
    public static int countAninmals = 0;
    public Animals(String name) {
        this.name = name;
        countAninmals++;
    }
    public void run(int distanceRun) {
        System.out.println(name + " не умеет бегать столько");
    }
    public void swim(int distanceSwim) {
        System.out.println(name + " не умеет плавать");
    }
}





