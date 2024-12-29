package Day2;

import java.util.Scanner;
import java.util.SortedMap;

public class CountBinary1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }
        System.out.println("Number of 1s in binary: " + count);
    }
}
