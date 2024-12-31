//Create a program to simulate a simple calculator using switch-case.

package Day2.ProgramControl;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int choice = s.nextInt();
        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
        System.out.println("The result is: " + result);
    }
}
