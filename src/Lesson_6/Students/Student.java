package Lesson_6.Students;

import java.util.Set;

public class Student {
    String name;
    int group;
    int course;
    int math;
    int rus;
    int eng;
    int history;
    int physics;
    double avg;

    public Student(String name, int group, int course, int math, int rus, int eng, int history, int physics, double avg) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.math = math;
        this.rus = rus;
        this.eng = eng;
        this.history = history;
        this.physics = physics;
        this.avg = (math + rus + eng + history + physics) / 5;
        }
        @Override
        public String toString () {
            return "Имя студента: " + name + " | группа: " + group + " | курс: " + course + " | средний балл: " + avg;
        }
        public double getAvg() {
        return avg;
        }
        public void promotion() {
        if (avg >= 3){
            course++;
        }
            }
        public String getName () {
        return name;
        }
        public int getCourse () {
        return course;
        }
            public static void printStudents(Set<Student> students, int course) {
            for(Student s : students) {
                if(s.getCourse() == course) {
                    System.out.println(s.getName());
                }
            }
        }

        }

