//Write a program to find the largest of three numbers using the ternary operator.
package Day2.Operators;

import java.util.*;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = s.nextInt();
        int largest = (num1 > num2)
                ? ((num1 > num3) ? num1 : num3)
                : ((num2 > num3) ? num2 : num3);

        System.out.println("The largest number is: " + largest);

    }
}
