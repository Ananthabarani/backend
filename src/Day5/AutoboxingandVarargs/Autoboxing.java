//Write a program to add a list of integers using a List<Integer> and demonstrate
// how autoboxing allows seamless addition of primitive int.

package Day5.AutoboxingandVarargs;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(8);
        int sum=0;
        for (int i:l){
            sum+=i;
        }
        System.out.println("Sum : "+ sum);
    }
}
