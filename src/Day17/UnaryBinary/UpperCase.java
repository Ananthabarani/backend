//UnaryOperator Write a Java program to use a UnaryOperator that converts a given string to uppercase.

package Day17.UnaryBinary;

import java.util.function.UnaryOperator;

public class UpperCase {
    public static void main(String[] args) {
        UnaryOperator<String> uop=(str)-> str.toUpperCase();
                System.out.println(uop.apply("anand"));
    }
}
