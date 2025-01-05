package Day7.ExtraProblems;//Given a string s, return true if the s can be palindrome after deleting at most one character from it.

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String :");
        String s1=s.next();
        int c=0;
        for(int i=0;i<s1.length();i++){
            String s2="";
            s2+=s1.substring(0,i);
            s2+=s1.substring(i+1,s1.length());
            StringBuilder sb=new StringBuilder(s2);
            sb.reverse();
            if(sb.toString().equals(s2)){
              c=1;
            }
        }
        if(c==1){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
