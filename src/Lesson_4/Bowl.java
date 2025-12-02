package Lesson_4;

public class Bowl {
    int food = 0;
    public Bowl(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }
    public void addFood(int amount) {
        if (amount < 0) {
            System.out.println("Нельзя добавлять отрицательное количсество еды");
        }
        else {
            food = food + amount;
            System.out.println("В миску добавлено " + amount + " грамм еды");
        }
    }
    public void decrease(int amount) {
        food = food - amount;
    }
    public void info (){
        System.out.println("В миске " + food + " грамм еды" );
    }
}
