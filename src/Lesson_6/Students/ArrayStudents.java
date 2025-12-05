package Lesson_6.Students;

import java.util.*;

public class ArrayStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Василий", 2, 1, 5, 3, 4, 3, 5, 0));
        students.add(new Student("Петр", 2, 1, 3, 3, 3, 2, 3, 0));
        students.add(new Student("Иван", 1, 3, 5, 5, 5, 5, 5, 0));
        students.add(new Student("Сергей", 3, 2, 4, 3, 3, 5, 3, 0));
        students.add(new Student("Андрей", 2,1,5,5,4,4,3,0));
        for (Student s : students) {
            System.out.println(s);
        }
        students.removeIf(student -> student.getAvg() < 3);
        for (Student s : students) {
            System.out.println(s);
        }
        for (Student s : students) {
            s.promotion();
            System.out.println(s);
        }
        Set<Student> studentsSet = new HashSet<>(students);
        Student.printStudents(studentsSet, 2);
        }
    }