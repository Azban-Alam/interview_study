package Comparable_Interface;
import java.util.*;

class Student1 implements Comparable<Student1> {
    String name;
    int marks;

    Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student1 other) {
          return Integer.compare(this.marks, other.marks);// ascending order by marks
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class ComparableExample1 {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Alice", 85));
        students.add(new Student1("Bob", 92));
        students.add(new Student1("Charlie", 78));

        Collections.sort(students);

        for (Student1 s : students) {
            System.out.println(s);
        }
    }
}