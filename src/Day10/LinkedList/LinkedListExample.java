

//Create a program that allows the user to manage a task list using a LinkedList. Implement the following features:
//Add a task to the end of the list.
//Remove a task from the list by its name.
//Display all tasks in the list in the order they were added.
package Day10.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {

                LinkedList<String> list = new LinkedList<>();
                Scanner s = new Scanner(System.in);
                boolean t=true;
                while (t) {
                    System.out.println("\nTask List Manager");
                    System.out.println("1. Add a task");
                    System.out.println("2. Remove a task");
                    System.out.println("3. Display all tasks");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");

                    int ch = s.nextInt();// Consume newline character
                    s.nextLine();
                    switch (ch) {
                        case 1:
                            System.out.print("Enter the task to add: ");
                            list.add(s.nextLine());
                            System.out.println("Task added.");
                            break;

                        case 2:
                            System.out.print("Enter the task to add: ");
                            list.remove(s.nextLine());
                            System.out.println("Task removed.");
                            break;


                        case 3:
                            System.out.println(list);
                            break;

                        case 4:
                            System.out.println("Exiting Task List Manager. Goodbye!");
                            s.close();
                            return;

                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                }
            }
        }

