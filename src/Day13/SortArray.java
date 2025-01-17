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
