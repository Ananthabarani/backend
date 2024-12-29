package Day2;
import java.util.*;
public class BreakStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (enter 0 to exit): ");
            int number = s.nextInt();
            if (number == 0) {
                System.out.println("Exiting the loop...");
                break;
            }
            System.out.println("You entered: " + number);
        }
    }
}
