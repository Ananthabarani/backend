//Create a program to calculate the sum of all elements in an array.
package Day3.Single_DimensionalArray;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n=s.nextInt();
        System.out.println("Enter the Element: ");
        int a[]=new int[n];
        for(int i=0;i<n;a[i]=s.nextInt(),i++);
        int sum=0;
        for(int i=0;i<n;sum+=a[i],i++);
        System.out.println("Sum : "+sum);
    }
}
