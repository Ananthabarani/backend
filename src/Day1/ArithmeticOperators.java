package Day1;
import java.util.*;
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value1:");
        int a=sc.nextInt();
        System.out.println("Enter the value2:");
        int b=sc.nextInt();
        int add=a+b;
        int multiple=a*b;
        int subtract=a-b;
        int divide=a/b;
        int modulo=a%b;
        System.out.println("Addition:"+add);
        System.out.println("multiplication:"+multiple);
        System.out.println("subtraction:"+subtract);
        System.out.println("Quotient:"+divide);
        System.out.println("Remaind:"+modulo);

    }
}
