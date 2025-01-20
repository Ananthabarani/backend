//Write a method to sort an array of integers.
//  Test cases should include arrays with duplicates, already sorted arrays, and empty arrays.
package Day13;

import java.util.Arrays;

public class SortArray {
    public int[] sortarray(int[]a){
        if (a==null){
            return null;
        }
        int[]res= Arrays.copyOf(a,a.length);
        Arrays.sort(res);
        return res;
    }
}
