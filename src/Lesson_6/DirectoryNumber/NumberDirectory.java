package Lesson_6.DirectoryNumber;

import java.util.ArrayList;
import java.util.List;

public class NumberDirectory {
    String lastName;
    long phone;

    public NumberDirectory(String lastName, long phone) {
        this.lastName = lastName;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return lastName + " " + phone;
    }

    public String getLastName() {
        return lastName;
    }

    public static List<Long> get(ArrayList<NumberDirectory> directory, String lastName) {
        List<Long> phones = new ArrayList<>();
        for (NumberDirectory s : directory) {
            if (s.lastName.equalsIgnoreCase(lastName)) {
                phones.add(s.phone);
            }
        }
        return phones;
    }
}
