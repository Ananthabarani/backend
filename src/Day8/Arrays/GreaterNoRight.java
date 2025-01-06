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

