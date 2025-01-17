package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {

    @Test
    void sortarray1() {
        SortArray as=new SortArray();
        int[]a1=as.sortarray(new int[]{});
        assertArrayEquals(new int[]{},a1);
    }
    @Test
    void sortarray2() {
        SortArray as=new SortArray();
        int[]a2=as.sortarray(new int[]{1});
        assertArrayEquals(new int[]{1},a2);
    }
    @Test
    void sortarray3() {
        SortArray as=new SortArray();
        int[]a3=as.sortarray(new int[]{1,2,3});
        assertArrayEquals(new int[]{1,2,3},a3);
    }
    @Test
    void sortarray4() {
        SortArray as=new SortArray();
        int[]a4=as.sortarray(new int[]{5,3,1});
        assertArrayEquals(new int[]{1,3,5},a4);
    }
    @Test
    void sortarray5() {
        SortArray as=new SortArray();
        int[]a5=as.sortarray(new int[]{1,2,1,2});
        assertArrayEquals(new int[]{1,1,2,2},a5);
    }
}