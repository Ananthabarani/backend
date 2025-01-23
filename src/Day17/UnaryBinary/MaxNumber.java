//BinaryOperator Create a program using a BinaryOperator to find the maximum of two integers.

package Day17.UnaryBinary;

import java.util.function.BinaryOperator;

public class MaxNumber {
    public static void main(String[] args) {
        BinaryOperator<Integer> bop=(i,j)->Math.max(i,j);
        System.out.println("Max Number :"+ bop.apply(5,50));
    }
}
