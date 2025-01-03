//Write a program that takes a sentence as input from the user and performs the following operations:
//Count the number of words in the sentence.
//Reverse the entire sentence.
//Replace all vowels in the sentence with the character '*'.


package Day6.StringExample;
import  java.util.*;
public class Sample2 {
    public static void main(String[] args) {
                Scanner s=new Scanner (System.in);
                System.out.print("Enter a sentence: ");
                String s1 = s.nextLine();
                System.out.println("Number of words: " + countWords(s1));
                System.out.println("Reversed sentence: " + reverseSentence(s1));
                System.out.println("Sentence with vowels replaced: " + replaceVowels(s1));
            }
            public static int countWords(String s1) {
                if (s1 == null ) {
                    return 0;
                }
                String[] words = s1.split(" ");
                return words.length;
            }
            public static String reverseSentence(String s1) {
                if (s1 == null) {
                    return s1;
                }
                StringBuilder sb = new StringBuilder(s1);
                return sb.reverse().toString();
            }
            public static String replaceVowels(String s1) {
                if (s1 == null ) {
                    return s1;
                }
                return s1.replaceAll("[AEIOUaeiou]", "*");
            }
        }