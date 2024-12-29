package Day2;

import java.util.Scanner;

public class ReverseTheNumber
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n=s.nextInt();
        int ans=0;
        while(n!=0){
            int t=n%10;
            ans=ans*10+t;
            n=n/10;
        }
        System.out.println("The Answer is : "+ ans);
    }
}
