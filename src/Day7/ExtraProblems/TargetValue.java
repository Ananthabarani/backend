package Day7.ExtraProblems;//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.




import java.util.Scanner;

public class TargetValue {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n=s.nextInt();
        System.out.println("Enter the Target Value: ");
        int t=s.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<n;a[i]=s.nextInt(),i++);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == t) {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}

