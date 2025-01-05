package Day7.ExtraProblems;//For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
//Given strings sequence and word, return the maximum k-repeating value of word in sequence.

import java.util.Scanner;

public class RepeatingWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s1=s.next();
        System.out.println("Enter the String 2");
        String s2= s.next();
        int n=s2.length();
        String s3=" ";
        int c=0;
        for(int i=0;i<=s1.length()-n;i++){
            s3=s1.substring(i,n+i);
            if(s2.equals(s3)){
                c++;
            }
            s3=" ";
        }
        System.out.println(c);
    }
}
