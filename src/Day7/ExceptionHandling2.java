package Day7;//Write a Java program that takes two numbers as input from the user and divides the first number by the second. Handle the following exceptions:
//ArithmeticException: If the second number is zero, display an error message: "Division by zero is not allowed."
//InputMismatchException: If the user enters non-numeric input, display an error message: "Invalid input. Please enter numeric values."
//General Exception: For any other unexpected errors, display a generic error message: "An error occurred: [error message]."


import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionHandling2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try {
            System.out.println("Enter the Frist Number : ");
            int n1 = s.nextInt();
            System.out.println("Enter the Second  Number : ");
            int n2 = s.nextInt();
            int result=n1/n2;
            System.out.println("Result : "+ result);
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (Exception e) {
            System.out.println("An error occurred: "    );
        }

    }
}
