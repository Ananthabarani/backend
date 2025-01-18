//Write a method to reverse a string.
// Test edge cases like an empty string, a single character, and a string with special characters.

package Day13;

public class ReverseString {
    public String rev(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
