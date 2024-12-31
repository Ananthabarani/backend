//Write a program to print all numbers from 1 to 100, skipping multiples of 5 (use continue).
package Day2.ProgramControl;

public class MultipleOf5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }}