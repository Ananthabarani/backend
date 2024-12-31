//Write a program to swap two numbers without using a third variable (use XOR).
package Day2.Operators;

import java.util.Scanner;

public class SwapTwonumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Frist Number: ");
        int n1=s.nextInt();
        System.out.println("Enter the Second Number: ");
        int n2=s.nextInt();
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        System.out.println("n1 : "+n1);
        System.out.println("n2 : "+ n2);
    }
}
