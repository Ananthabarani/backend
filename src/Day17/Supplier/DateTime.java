//Simple Supplier Write a Java program to use a Supplier that returns the current date and time.

package Day17.Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class DateTime {
    public static void main(String[] args) {
        Supplier<String> timedate=()-> LocalDateTime.now().toString();
        System.out.println(timedate.get());
    }
}
