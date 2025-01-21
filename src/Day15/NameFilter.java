//Find Students with Names Starting with a Letter
//Write a method that finds all students whose names start with a specific letter.

package Day15;
import java.util.*;
import java.util.stream.Collectors;

public class NameFilter {
    static class Student {
        private String name;
        private double gpa;

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + " (GPA: " + gpa + ")";
        }
    }
    public static List<Student> findStudentsByInitial(List<Student> students, char initial) {
        return students.stream()
                .filter(student -> student.getName().startsWith(String.valueOf(initial)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.8),
                new Student("Bob", 3.2),
                new Student("Charlie", 3.9),
                new Student("David", 3.5)
        );
        char initial = 'A';
        List<Student> filteredStudents = findStudentsByInitial(students, initial);
        System.out.println("Students whose names start with '" + initial + "':");
        filteredStudents.forEach(System.out::println);
    }
}
