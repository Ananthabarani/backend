package Day13;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    @org.junit.jupiter.api.Test
    public void empty() {
        ReverseString rs1 = new ReverseString();
        String str1=rs1.rev("");
        Assert.assertEquals("",str1);
    }
    @org.junit.jupiter.api.Test
    public void Single() {
        ReverseString rs2 = new ReverseString();
        String str2=rs2.rev("A");
        Assert.assertEquals("A",str2);
    }
    @org.junit.jupiter.api.Test
    public void Normal() {
        ReverseString rs3 = new ReverseString();
        String str3=rs3.rev("Joyboy");
        Assert.assertEquals("yobyoJ",str3);
    }
    @org.junit.jupiter.api.Test
    public void Special() {
        ReverseString rs4 = new ReverseString();
        String str4=rs4.rev("G@me");
        Assert.assertEquals("em@G",str4);
    }
    @org.junit.jupiter.api.Test
    public void Numeric() {
        ReverseString rs5 = new ReverseString();
        String str5=rs5.rev("12345");
        Assert.assertEquals("54321",str5);
    }
}