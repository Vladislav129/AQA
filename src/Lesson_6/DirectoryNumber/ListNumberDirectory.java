package Lesson_6.DirectoryNumber;

import java.util.ArrayList;
import java.util.List;


public class ListNumberDirectory {
    public static void main(String[] args) {
        ArrayList<NumberDirectory> directory = new ArrayList<>();
        directory.add(new NumberDirectory("Сидоров", 92387622193L));
        directory.add(new NumberDirectory("Петров", 9223332222L));
        directory.add(new NumberDirectory("Иванова", 9630285321L));
        directory.add(new NumberDirectory("Петров", 9332132727L));
        System.out.println(directory.toString());
        List<Long> petrov = NumberDirectory.get(directory, "Петров");
        System.out.println(petrov);
    }
}

