package Day2;

import java.util.Scanner;
import java.util.SortedMap;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=s.nextInt();
        int c=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==1 && n>0){
            System.out.println("It is Prime Number");
        }
        else{
            System.out.println("Not a Prime Nmber ");
        }
    }
}
