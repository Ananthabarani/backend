//Create a class Calculator with overloaded methods add(int, int), add(double, double), and add(int, int, int).
// Test all methods.
package Day3.Polymorphism;

public class Calculator {



     static int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    static double add(double a,double b){
        double sum=a+b;
        return sum;
    }
    static int add(int a,int b,int c) {
        int sum = a + b + c;
        return sum;
    }
        public static void main (String[]args){
            System.out.println(add(4,5));
            System.out.println(add(2.0,3.0));
            System.out.println(add(2,3,4));
        }

}


