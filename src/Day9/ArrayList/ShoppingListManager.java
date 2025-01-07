//Create a program that allows the user to manage a shopping list using an ArrayList. Implement the following features:
//Add items to the shopping list.
//Remove an item from the list.
//Display the shopping list.

package Day9.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListManager {
    public static void main(String[] args) {

                ArrayList<String> shoppingList = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("1. Add item to the shopping list");
                    System.out.println("2. Remove item from the shopping list");
                    System.out.println("3. Display the shopping list");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (choice) {
                        case 1:
                            System.out.print("Enter item to add: ");
                            String add = scanner.nextLine();
                            shoppingList.add(add);
                            System.out.println(add + " added to the shopping list.");
                            break;
                        case 2:
                            System.out.print("Enter item to remove: ");
                            String remove = scanner.nextLine();
                            if (shoppingList.remove(remove)) {
                                System.out.println(remove + " removed from the shopping list.");
                            } else {
                                System.out.println(remove + " not found in the shopping list.");
                            }
                            break;
                        case 3:
                            System.out.println("Shopping List: " + shoppingList);
                            break;
                        case 4:
                            System.out.println("Exiting...");
                            scanner.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            }
        }
