//Calculate Average GPA
//Write a method that calculates the average GPA of a list of students using a lambda expression.
package Day15;
import java.util.*;
import java.util.stream.Collectors;

class Example {
    private String name;
    private double gpa;

    public Example(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}

public class AverageGpaCalculator {
    public static double calculateAverageGpa(List<Student> students) {
        return students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.8),
                new Student("Bob", 3.2),
                new Student("Charlie", 3.9),
                new Student("David", 3.5)
        );
        double averageGpa = calculateAverageGpa(students);
        System.out.println("Average GPA: " + averageGpa);
    }
}
