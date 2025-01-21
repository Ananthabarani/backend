//Transform a List of Names
//Write a method that takes a list of student names and transforms
// each name into uppercase letters with a prefix like "Student: " using map.

package Day15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class ExampleStudent {
    private String name;
    private int grade;

    public ExampleStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class StudentsWithPassingGrades {
    public static void main(String[] args) {

        List<ExampleStudent> students = Arrays.asList(
                new ExampleStudent("John", 75),
                new ExampleStudent("Alice", 55),
                new ExampleStudent("Mark", 88)
        );


    }
}

// Higher-order func
