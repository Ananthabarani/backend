//Given an array of integers, find the largest sum of a contiguous subarray.
// Implement an efficient algorithm to solve this problem.
//Example:
//Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//Output: 6
//Explanation: The subarray [4, -1, 2, 1] has the largest sum = 6.

package Day8.Arrays;
import java.util.Scanner;
public class LargestSumArray {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the size");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the number :");
        int sum1=0,sum2=0;
        for(int i=0;i<n;a[i]=s.nextInt(),i++);
        for(int i=0;i<n-1;i++){
            sum1+=a[i];
            for(int j=i+1;j<n;j++){
                sum1+=a[j];
                if(sum2<sum1){
                    sum2=sum1;
                }
            }
            sum1=0;
        }
        System.out.println(sum2);
    }
}
