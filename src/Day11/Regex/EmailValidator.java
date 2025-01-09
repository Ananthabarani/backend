//Task: Write a Java program to validate a list of email addresses using regular expressions. The program should:
//Accept a list of email addresses as input.
//Validate each email address against the following rules:
//It must start with a letter or a number.
//It can include letters, numbers, dots (.), hyphens (-), and underscores (_).
//The domain name should be valid, ending with .com, .org, or .net.
//Print whether each email address is valid or invalid.
package Day11.Regex;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static void main(String[] args) {
        // Regular expression for email validation
        String emailformat = "[a-zA-Z0-9._-]*@[a-zA-Z0-9]+\\.(com|org|net)$";
        Pattern pattern = Pattern.compile(emailformat);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of email addresses to validate:");
        int n=s.nextInt();
        List<String> emails = new ArrayList<>();
        System.out.println("Enter the email addresses one by one:");
        for (int i = 0; i < n; i++) {
            emails.add(s.next());
        }
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                System.out.println(email + " is valid.");
            } else {
                System.out.println(email + " is invalid.");
            }
        }
    }
}
