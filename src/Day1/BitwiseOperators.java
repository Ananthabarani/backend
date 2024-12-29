package Day1;
import java.util.*;
public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans1=num1^num2;
        int ans2=num1>>2;
        int ans3=num2<<2;
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
