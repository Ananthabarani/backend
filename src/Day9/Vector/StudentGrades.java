//Student Grades Management System
//You are tasked with creating a program to manage student grades using a Vector in Java. Implement the following functionalities:
//Add grades (as integers) to a vector dynamically.
//Print all grades in the vector.
//Calculate and display:
//The highest grade.
//The lowest grade.
//The average grade.
//Allow the user to remove a specific grade by its index.
package Day9.Vector;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class StudentGrades {
    Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(78);
        vector.add(85);
        vector.add(92);
        vector.add(67);
        vector.add(88);
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
        int max=Collections.max(vector);
        int min =Collections.min(vector);
        int sum=0,avg=0;
        for(int i:vector){
            sum+=i;
        }
        avg=sum/vector.size();
        System.out.println("The highest grade :"+ max);
        System.out.println("The lowest grade : "+min);
        System.out.println("The average grade: "+avg);
    }
}