package Day13;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @org.junit.Test
    public void findfact() {
        Factorial f=new Factorial();
        long f1=f.findfact(0);
        assertEquals(1,f1);
    }
    @Test
    public void findfact2() {
        Factorial f=new Factorial();
        long f2=f.findfact(1);
        assertEquals(1,f2);
    }
    @Test
    public void findfact3() {
        Factorial f=new Factorial();
        long f3=f.findfact(5);
        assertEquals(120,f3);
    }
    @Test
    public void findfact4() {
        Factorial f=new Factorial();
        long f4=f.findfact(10);
        assertEquals(3628800,f4);
    }
    @Test
    public void findfact5() {
        Factorial f=new Factorial();
        long f5=f.findfact(-10);
        assertEquals(-1,f5);
    }
}