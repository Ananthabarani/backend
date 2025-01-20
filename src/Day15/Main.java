//Sort a List of Students
//Write a method that takes a list of Student objects and sorts them by their GPA in descending order using a lambda expression.
package Day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.2));
        students.add(new Student("Charlie", 3.9));
        students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        System.out.println("Students sorted by GPA (descending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
