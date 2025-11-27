package Lesson_4;

public class Bowl {
    int food;
    public Bowl(int food) {
        this.food = food;

    }
    public int getFood() {
        return food;
    }
    public void addFood(int amount) {
        food = food + amount;
        System.out.println("В миску добавлено " + amount + " грамм еды");
    }
    public void decrease(int amount) {
        food = food - amount;
        System.out.println("В миске сейчас " + amount + " грамм еды");
    }
    public void info (){
        System.out.println("В миске " + food + " грамм еды" );
    }
}
