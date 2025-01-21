//Use a Function<String, Integer> to map a list of strings to their lengths.
package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        String s[] = {"Anand", "Barani", "Barath", "Jeeva"};
        Function<String, Integer> f = (s1) -> s1.length();
        List<Integer> list=new ArrayList<>();
        for (String string : s) {
            list.add(f.apply(string));
        }
        System.out.println(list);
    }
}
