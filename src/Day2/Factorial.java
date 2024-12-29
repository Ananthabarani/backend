package Day2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("enter the number :");
        int n=s.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        System.out.println("Factorial of the number :"+ fac);
    }
}
