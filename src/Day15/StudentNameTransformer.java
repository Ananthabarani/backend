//Transform a List of Names
//Write a method that takes a list of student names and transforms
// each name into uppercase letters with a prefix like "Student: " using map.

package Day15;
import java.util.*;
import java.util.stream.Collectors;

public class StudentNameTransformer {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> transformedNames = studentNames.stream()
                .map(name -> "Student: " + name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(transformedNames);
    }
}
