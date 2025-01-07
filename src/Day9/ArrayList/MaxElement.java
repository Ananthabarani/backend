//Create a program to find the maximum element in an ArrayList of integers.
package Day9.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(s.nextInt());
        list.add(s.nextInt());
        list.add(s.nextInt());
        list.add(s.nextInt());
        list.add(s.nextInt());
        list.add(s.nextInt());
        System.out.println("Max Elements in ArrayList: "+Collections.max(list));
    }
}
