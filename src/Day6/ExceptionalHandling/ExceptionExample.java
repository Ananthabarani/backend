//Write a program that:
//Accepts two integers from the user as input.
//Attempts to divide the first integer by the second.
//Implements exception handling to manage the following scenarios:
//Division by zero: Display an error message "Error: Division by zero is not allowed.".
//Invalid input: Display an error message "Error: Please enter valid integers.".
//Any other exceptions: Display "An unexpected error occurred.".


package Day6.ExceptionalHandling;
import java.util.Scanner;
public class ExceptionExample extends Throwable {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            try {
                System.out.print("Enter the first integer: ");
                int num1 =s.nextInt();
                System.out.print("Enter the second integer: ");
                int num2 = s.nextInt();
                int result = num1 / num2;
                System.out.println("The result of the division is: " + result);

            }
            catch (NumberFormatException e)
            {
                System.out.println(" Please enter valid integers..");
            }
            catch (ArithmeticException e)
            {
                System.out.println(" Division by zero is not allowed.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred.");
            }
    }

}
