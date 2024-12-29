package Day1;
import java.util.*;
public class LogicalandRelationalOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value1:");
        int num1=sc.nextInt();
        System.out.println("Enter the value2:");
        int num2=sc.nextInt();
        boolean ans1=num1>num2;
        System.out.println(ans1);
        boolean ans2=num1>0&&num2>0;
        System.out.println(ans2);
        boolean ans3=num1<0||num2<0;
        System.out.println(ans3);
    }
}

