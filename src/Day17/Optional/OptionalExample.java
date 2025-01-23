//Handling Null with Optional Write a program that accepts a String input, converts it
// to uppercase if it's not null, and prints "Empty input" if the string is null.

package Day17.Optional;

import java.util.Optional;
import java.util.Scanner;


public class OptionalExample {
    public OptionalExample(String s1){
       Optional<String> opt= Optional.ofNullable(s1);
       if(opt.isPresent()) {
           System.out.println(s1.toUpperCase());
       }
       else {
           System.out.println("Empty");
       }
    }

    public static void main(String[] args) {
        String s1="anand";
        String s2=null;
        OptionalExample op=new OptionalExample(s1);
        OptionalExample op1=new OptionalExample(s2);

    }
}
