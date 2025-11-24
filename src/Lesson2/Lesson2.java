package Lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    public static void checkSumSign() {
        int a = 2, b = -3;
        int c = a + b;
        if (c >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }
    public static void printColor() {
        int value = 244;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
        System.out.println("Желтый");
        else if (value > 100)
            System.out.println("Зеленый");
    }
    public static void compareNumbers(){
        int a = 5, b = -5;
        if (a >= b)
            System.out.println(a+" >= "+b);
        else
            System.out.println(a+" < "+b);
    }
    public static void inputNumbersBoolean(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        int a = input.nextInt();
        System.out.println("Введите второе число: ");
        int b = input.nextInt();
        int c = a + b;
        boolean diapason = (c >= 10 && c <=20);
            System.out.println(diapason);
    }
    public static void numberCheckSign(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int num = input.nextInt();
        String positive = "Вы написали положительное число";
        String negative = "Вы написали отрицальеное число";
        if (num>=0)
           System.out.println(positive);
        else
           System.out.println(negative);
    }
    public static void numberCheckBoolean(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int num = input.nextInt();
        boolean trueOrFalse = (num<0);
            System.out.println(trueOrFalse);
    }

    public static void signNumberString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int count = input.nextInt();
        int num = 0;
        input.nextLine();
        System.out.println("Введите любую строку: ");
        String str = input.nextLine();
        while (num < count) {
            System.out.println(str);
            ++num;
        }
    }
    public static void checkLeapYear() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = input.nextInt();
        boolean leap = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        System.out.println(leap);
        };

    public static void changeArray() {
        int[] arr = {1,0,1,1,1,1,0,0,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
        }
    public static void voidArray() {
        int[] arr = new  int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }public static void array() {
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void twoDimensionalArray() {
        int[][] arr = new  int[5][5];
        for  (int a = 0; a < arr.length; a++) {
            arr[a][arr.length-1-a] = 1;
            for(int b = 0; b < arr[a].length; b++) {
                if (a == b)
                    arr[a][b] = 1;
                System.out.printf("%2d", arr[a][b]);
            }
            System.out.println();
        }
    }
    public static void signLenInitialValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = input.nextInt();
        int[] arr = new int[len];
        System.out.println("Введите значение для массива: ");
        int initialValue = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    }








