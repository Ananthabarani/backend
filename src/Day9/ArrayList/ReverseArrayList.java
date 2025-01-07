//Create a program that reverses the order of elements in an ArrayList.

package Day9.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        l.add(s.nextInt());
        l.add(s.nextInt());
        l.add(s.nextInt());
        l.add(s.nextInt());
        l.add(s.nextInt());
        Collections.reverse(l);
        System.out.println("Reversed List :"+ l);
    }
}
