package Comparable_Interface;
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {

        // Null safety check
        if (other == null) {
            throw new NullPointerException("Cannot compare with null");
        }

        // Safe comparison (avoids integer overflow)
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students);

        System.out.println(students);
    }
}