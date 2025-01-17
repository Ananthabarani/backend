package Day13;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeStringTest {
    @org.junit.jupiter.api.Test
    public void palTest1(){
        PalindromeString pals=new PalindromeString();
        boolean b1= pals.pal("Madam");
        assertEquals(true,b1);
    }
    @org.junit.jupiter.api.Test
    public void palTest2(){
        PalindromeString pals=new PalindromeString();
        boolean b2= pals.pal("A Santa at NASA");
        assertEquals(false,b2);
    }
    @org.junit.jupiter.api.Test
    public void palTest3(){
        PalindromeString pals=new PalindromeString();
        boolean b3= pals.pal("Hello");
        assertEquals(false,b3);
    }
    @org.junit.jupiter.api.Test
    public void palTest4(){
        PalindromeString pals=new PalindromeString();
        boolean b4= pals.pal("A");
        assertEquals(true,b4);
    }
    @org.junit.jupiter.api.Test
    public void palTest5(){
        PalindromeString pals=new PalindromeString();
        boolean b5= pals.pal("");
        assertEquals(true,b5);
    }
}