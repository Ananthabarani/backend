//For each element in an array, find the next greater element to its right.
// If no such element exists, return -1 for that number.
//Example:
//Input: nums = [4, 5, 2, 10]
//Output: [5, 10, 10, -1]
//Explanation: The next greater element for 4 is 5, for 5 is 10, for 2 is 10, and for 10 there is no greater element.
package Day8.Arrays;

import java.util.Scanner;

public class GreaterNoRight {
   public static  void cal(int a[]) {
       int[] result = new int[a.length];
       for (int i = 0; i < a.length; i++) {
           result[i] = -1;
           for (int j = i + 1; j < a.length; j++) {
               if (a[j] > a[i]) {
                   result[i] = a[j];
                   break;
               }
           }
       }
       for(int n:result){
           System.out.print(n+" ");
       }
   }
       public static void main (String[]args){
           Scanner s = new Scanner(System.in);
           System.out.println("Enter the Size :");
           int n = s.nextInt();
           int a[] = new int[n];
           System.out.println("Enter the Elements : ");
           for (int i = 0; i < n; a[i] = s.nextInt(), i++) ;
           cal(a);
       }

}

