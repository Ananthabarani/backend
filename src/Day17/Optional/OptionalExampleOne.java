//Using Optional with Default Values Write a program that uses Optional to
// provide a default value of "Guest" when no name is provided.
package Day17.Optional;

import java.util.Optional;
import java.util.Scanner;

public class OptionalExampleOne {
    public OptionalExampleOne(String s1){
        Optional<String> opt= Optional.ofNullable(s1);
        System.out.println(opt.orElse("Guest"));
    }

    public static void main(String[] args) {
        String s1="anand";
        String s2=null;
        OptionalExample op=new OptionalExample(s1);
        OptionalExample op1=new OptionalExample(s2);

    }
}
