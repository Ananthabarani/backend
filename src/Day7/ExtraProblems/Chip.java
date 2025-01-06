package Day7.ExtraProblems;

import java.util.Scanner;

public class Chip {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size");
        int n=s.nextInt();
        System.out.println("Enter the Elements : ");
        int a[]=new int[n];
        for(int i=0;i<n;a[i]=s.nextInt(),i++);
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                c1++;
            }
            else{
                c2++;
            }
        }
        System.out.println(Math.min(c1,c2));
    }
}
