package Day18;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class SreamExample {
    public static void main(String[] args) {


    List<Student> students = Arrays.asList(
            new Student("Anand", Arrays.asList(85, 90, 78, 92, 88), "Computer Science"),
            new Student("Barani", Arrays.asList(95, 98, 100, 89, 97), "Mathematics"),
            new Student("jeeva", Arrays.asList(45, 50, 48, 42, 40), "Physics"),
            new Student("Santhosh", Arrays.asList(75, 80, 78, 85, 82), "Computer Science"),
            new Student("Barath", Arrays.asList(35, 40, 30, 25, 20), "Mathematics"),
            new Student("Sudhan", Arrays.asList(60, 65, 70, 58, 62), "Physics"),
            new Student("Vaj", Arrays.asList(88, 85, 90, 87, 86), "Computer Science"),
            new Student("Arul", Arrays.asList(55, 60, 58, 57, 59), "Mathematics")
    );
        System.out.println("Top 3 Students:");
        students.stream()
                .sorted(comparing(Student::getAverageMarks).reversed())
            .limit(3)
                .forEach(System.out::println);

        System.out.println("\nAssigning Grades:");
        students.forEach(student -> {
        double avg = student.getAverageMarks();
        if (avg >= 90) {
            student.setGrade("A");
        } else if (avg >= 75) {
            student.setGrade("B");
        } else if (avg >= 50) {
            student.setGrade("C");
        } else {
            student.setGrade("D");
        }
        System.out.println(student);
    });

        System.out.println("\nAverage Marks by Department:");
    Map<String, Double> avgMarksByDept = students.stream()
            .collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getAverageMarks)));
        avgMarksByDept.forEach((department, avgMarks) ->
            System.out.println(department + ": " + avgMarks));

        System.out.println("\nTop Student in Each Department:");
    Map<String, Optional<Student>> topStudentByDept = students.stream()
            .collect(Collectors.groupingBy(
                    Student::getDepartment,
                    Collectors.maxBy(comparing(Student::getAverageMarks))
            ));
        topStudentByDept.forEach((department, student) ->
            System.out.println(department + ": " + student.orElse(null)));

        System.out.println("\nNumber of Failing Students by Department:");
    Map<String, Long> failingStudentsByDept = students.stream()
            .filter(student -> student.getAverageMarks() < 50)
            .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
        failingStudentsByDept.forEach((department, count) ->
            System.out.println(department + ": " + count));
}
}
