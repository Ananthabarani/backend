package Day3;

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
