//Write a program that takes a float as input, converts it to int, and displays both values.
package Day1;
import java.util.*;
public class PrimitiveTypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.println("Float Value:"+f);
        System.out.println("Float to Integer:"+(int)f);
    }
}
