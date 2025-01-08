//Create a program that uses a Map to store and manage student names and their corresponding grades. Implement the following features:
//Add a student's name and grade to the map.
//Update a student's grade if the student already exists in the map.
//Retrieve a student's grade by their name.
//Display all students and their grades.
package Day10.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradesManager {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Grades Manager");
            System.out.println("1. Add a student and grade");
            System.out.println("2. Update a student's grade");
            System.out.println("3. Retrieve a student's grade");
            System.out.println("4. Display all students and grades");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = s.nextInt();
            s.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the student's name: ");
                    String name=s.nextLine();
                    System.out.println("Enter the grade");
                    int g=s.nextInt();
                    map.put(name,g);
                    break;

                case 2:
                    System.out.print("Enter the student's name: ");
                    String name1 = s.nextLine();

                    if (map.containsKey(name1)) {
                        System.out.print("Enter the new grade: ");
                        int newGrade = s.nextInt();
                        s.nextLine(); // Consume newline character
                        map.put(name1, newGrade);
                        System.out.println("Grade updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the student's name: ");
                    String nameToRetrieve = s.nextLine();

                    if (map.containsKey(nameToRetrieve)) {
                        System.out.println(nameToRetrieve + "'s grade: " + map.get(nameToRetrieve));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("All Students and Grades:");
                    System.out.println(map);
                    break;

                case 5:
                    System.out.println("Exiting !");
                    s.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
