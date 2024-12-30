package Day3;
import java.util.*;
public class LargerSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n=sc.nextInt();
        System.out.println("Enter the Element: ");
        int a[]=new int[n];
        for(int i=0;i<n;a[i]=sc.nextInt(),i++);
        Arrays.sort(a);
        System.out.println("Smallest Element :"+a[0]);
        System.out.println("Largest Elemnt :"+a[a.length-1]);
    }

}
