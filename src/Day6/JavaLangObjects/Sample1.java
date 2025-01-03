//Write a program to demonstrate the use of the following java.lang classes:
//Math - Perform basic mathematical operations like finding the square root, power, and maximum of two numbers.
//String - Manipulate a string by finding its length, converting it to uppercase, and extracting a substring.
//System - Print a message to the console and measure the execution time of a simple loop using System.currentTimeMillis().

package Day6.JavaLangObjects;

public class Sample1 {
    public static void main(String[] args) {
        int start=0;
        int a=5;
        int b=10;
        String   s="Anand";
        System.out.println("MAx Value : "+Math.max(a,b));
        System.out.println("Square root : "+Math.sqrt(a));
        System.out.println("Power : "+Math.pow(a,b));
        System.out.println("String length " +s.length());
        System.out.println("String uppercase : "+s.toUpperCase());
        System.out.println("Substring :"+ s.substring(0,3) );
       double Start=System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            System.out.println(i);
       }
        double End=System.currentTimeMillis();
        System.out.println("currentTimeMillis : "+ (End-Start));
    }
}
