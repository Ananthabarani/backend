package Day1;
import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        String ans=num1%2==0 ?"Even":"Odd";
        System.out.println(ans);
    }
}
