//Filter Even Numbers
//Write a program to filter all even numbers from a list of integers using a Predicate.
// Use a higher-order function to perform the filtering.
package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterEvenNumbers {
    public static void printList(List<Integer> list, Predicate<Integer> predicate){
        for (Integer i:list){
            if(predicate.test(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        FilterEvenNumbers fn=new FilterEvenNumbers();
        List<Integer> list=new ArrayList<Integer>();
        list.add(112);
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(12);
        list.add(21);
        printList(list,(value)->value%2==0);

    }
}