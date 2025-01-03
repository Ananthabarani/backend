// Write a program that:
//Takes two strings as input from the user.
//Compares them lexicographically using compareTo() method.
//Checks if the two strings are equal (case-sensitive and case-insensitive).
//Concatenates the two strings and prints the result.

package Day6.StringExample;
import java.util.*;
public class Sample3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        System.out.println("compare : "+ s1.compareTo(s2));
        System.out.println("case-sensitive : "+s1.equals(s2));
        System.out.println("case-insensitive: "+s1.equalsIgnoreCase(s2));
        System.out.println("Concatenates : "+ s1+s2);
    }
}
