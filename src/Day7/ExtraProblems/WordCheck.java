package Day7.ExtraProblems;//Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
//A substring is a contiguous sequence of characters within a string.

import java.util.Scanner;

public class WordCheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n=s.nextInt();
        String s1[]=new String[n];
        System.out.println("Enter the Element : ");
        for(int i=0;i<n;s1[i]=s.next(),i++);
        System.out.println("Enter the Word");
        String s2=s.next();
        int c=0;
        String s3=" ";
        for(int i=0;i<s1.length;i++ ){
            s3=s1[i];
            if(s2.contains(s3)){
                c++;
            }
            s3=" ";
        }
        System.out.println("Count :"+ c);
    }
}
