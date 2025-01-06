//Given an array containing n distinct numbers in the range [0, n], find the one number that is missing from the array.
//Example:
//Input: nums = [3, 0, 1]
//Output: 2
//Explanation: The missing number is 2 because it is not in the array.

package Day8.Arrays;
import java.util.Scanner;
public class MissingNumber {
    public int find(int[] nums) {
        int n = nums.length;
        int Sum1 = n * (n + 1) / 2;
        int Sum2 = 0;

        for (int num : nums) {
            Sum2 += num;
        }

        return Sum1 - Sum2;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n=s.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<n;a[i]=s.nextInt(),i++);
        int missing = missingNumber.find(a);
        System.out.println("The missing number is: " + missing);
    }
}
