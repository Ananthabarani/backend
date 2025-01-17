package Day13;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumTest {
    @org.junit.jupiter.api.Test
    public void TestZero(){
        PrimeNum n=new PrimeNum();
        boolean prime1=n.isPrime(0);
        assertEquals(false,prime1);
    }
    @org.junit.jupiter.api.Test
    public void TestOne(){
        PrimeNum n=new PrimeNum();
        boolean prime2=n.isPrime(1);
        assertEquals(false,prime2);
    }
    @org.junit.jupiter.api.Test
    public void TestNegative(){
        PrimeNum n=new PrimeNum();
        boolean prime3=n.isPrime(-10);
        assertEquals(false,prime3);
    }
    @org.junit.jupiter.api.Test
    public void TestSmall(){
        PrimeNum n=new PrimeNum();
        boolean prime4=n.isPrime(4);
        assertEquals(true,prime4);
    }
    @org.junit.jupiter.api.Test
    public void TestLarge(){
        PrimeNum n=new PrimeNum();
        boolean prime5=n.isPrime(1024);
        assertEquals(false,prime5);
    }
}