//Write a method that groups students by department and finds the top scorer in each department using Collectors.
// groupingBy and maxBy.

package Day15;

import java.util.*;
import java.util.stream.Collectors;

class Cal {
    private String name;
    private String department;
    private double gpa;

    public Cal(String name, String department, double gpa) {
        this.name = name;
        this.department = department;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ")";
    }
}

public class TopScorer {
    public static void main(String[] args) {
        List<Cal> students = Arrays.asList(
                new Cal("Alice", "Computer Science", 3.8),
                new Cal("Bob", "Mathematics", 3.2),
                new Cal("Charlie", "Computer Science", 3.9),
                new Cal("David", "Mathematics", 3.5),
                new Cal("Eve", "Physics", 3.7)
        );
        Map<String, Cal> topScorersByDepartment = students.stream()
                .collect(Collectors.groupingBy(
                        Cal::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Cal::getGpa)),
                                Optional::get
                        )
                ));
        System.out.println("Top scorer in each department:");
        topScorersByDepartment.forEach((department, student) ->
                System.out.println(department + ": " + student)
        );
    }
}
