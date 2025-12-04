package Lesson_5;

import java.util.Scanner;

public class Array {
    public static void arr() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число 4 для создания массива 4х4");
        int len = input.nextInt();
        System.out.println("Еще раз введите число 4 для создаемя массива 4х4");
        int len1 = input.nextInt();
        if (len != 4 || len1 != 4) {
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                System.out.println("Массив 4х4 не создался, так как ввели другие значения");
            }
        } else {
            String[][] strArr = new String[len][len1];
            String[][] strArr1 = {
                    {"1", "2", "3", "4"},
                    {"5", "f", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };
            try{
                System.out.println(strArr1[1][5]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Выход за пределы границы массива");
            }
            for (int a = 0; a < len; a++) {
                for (int b = 0; b < len1; b++) {
                }
            }
            int[][] intArr = new int[len][len1];
            for (int a = 0; a < len; a++) {
                for (int b = 0; b < len1; b++) {
                    try {
                        intArr[a][b] = Integer.parseInt(strArr1[a][b]);
                        System.out.printf("%4d", intArr[a][b]);
                    } catch (NumberFormatException e) {
                        try {
                            throw new MyArrayDataException();
                        } catch (MyArrayDataException ex) {
                            System.out.println(" Ошибка в ячейке [" + a + "][" + b + "]: " + strArr1[a][b]);
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}