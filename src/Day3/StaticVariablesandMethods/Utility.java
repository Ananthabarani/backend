//Create a class Utility with a static method convertToUpper(String str) that takes a string as input and returns it in uppercase.
// Test this method in the main function.
package Day3.StaticVariablesandMethods;

import java.util.Scanner;

public class Utility {
    public static String convertToUpper( String str){
        if(str==null){
            return null;
        }
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(convertToUpper(str));
    }
}
