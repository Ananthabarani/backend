//Write a function to rotate an array of n integers to the
// right by k steps.
//Example:
//Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3
//Output: [5, 6, 7, 1, 2, 3, 4]
//Explanation: Rotate the array to the right by 3 steps.

package Day8.Arrays;
import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the number :");
        for (int i = 0; i < n; a[i] = s.nextInt(), i++) ;
        System.out.println("Enter the k Value :");
        int k = s.nextInt();
        rotate(a, k);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
        public  static void rotate( int[] nums, int k){
            k = k % nums.length;
            int n = nums.length;
            for (int i = 0; i < k; i++) {
                int last = nums[n - 1];
                for (int j = n - 1; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = last;
            }

        }
    }



