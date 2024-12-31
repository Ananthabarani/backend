//Write a program to find the factorial of a number using loops and arithmetic operators.
package Day2.Operators;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("enter the number :");
        int n=s.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        System.out.println("Factorial of the number :"+ fac);
    }
}
