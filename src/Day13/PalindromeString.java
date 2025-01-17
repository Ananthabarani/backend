package Day13;

public class PalindromeString {
    public boolean pal(String str){
        String reverse=new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverse);
    }
}
