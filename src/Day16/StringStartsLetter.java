//String Starts with Letter
//Create a method that takes a Predicate<String> and a list of strings and
// filters out all strings that start with a particular letter (e.g., 'A').
package Day16;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringStartsLetter {
    public static void printList(List<String> list, Predicate<String> predicate) {
        for (String i : list) {
            if (predicate.test(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        FilterEvenNumbers fn = new FilterEvenNumbers();
        List<String> list = new ArrayList<String>();
        list.add("Anand");
        list.add("Barani");
        list.add("Adhi");
        list.add("Aarthi");
        list.add("Barath");
        list.add("Barathiu");
        printList(list, (value) -> value.startsWith("A"));

    }
}
