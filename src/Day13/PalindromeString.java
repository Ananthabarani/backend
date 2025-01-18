//Implement a method to check if a string is a palindrome.
// Write test cases for valid palindromes, non-palindromes, and case sensitivity.

package Day13;

public class PalindromeString {
    public boolean pal(String str){
        String reverse=new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverse);
    }
}
