//Given an array of integers and a target number, return the indices of the two numbers that add up to the target. Assume that there is exactly one solution.
//Example:
//Input: nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]
//Explanation: nums[0] + nums[1] = 2 + 7 = 9.
package Day8.Arrays;
import java.util.Scanner;

public class TargetValue {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n=s.nextInt();
        System.out.println("Enter the Target Value: ");
        int t=s.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<n;a[i]=s.nextInt(),i++);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == t) {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
