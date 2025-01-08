//Set:
//Create a program that uses a Set to store a collection of unique names. Implement the following features:
//Add names to the set.
//Check if a name is already present in the set.
//Display all unique names in the set.

package Day10.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNamesManager {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nUnique Names Manager");
            System.out.println("1. Add a name");
            System.out.println("2. Check if a name exists");
            System.out.println("3. Display all unique names");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = s.nextInt();
            s.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the name to add: ");
                     set.add(s.nextLine());
                    break;

                case 2:
                    System.out.print("Enter the name to check: ");
                    if (set.contains(s.nextLine())) {
                        System.out.println("Name is already in the set.");
                    } else {
                        System.out.println("Name is not in the set.");
                    }
                    break;

                case 3:
                    System.out.println(set);
                    break;

                case 4:
                    System.out.println("Exiting Unique Names Manager. Goodbye!");
                    s.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
