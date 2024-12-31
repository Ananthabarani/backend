//Implement method overloading in a class Calculator with methods
// to add integers, doubles, and arrays of numbers.
package Day2.OOPBasics;

public class CalculatorOverloading {
   static   int Add(int a,int b){
    return a+b;

    }
     static double Add(double a,double b){
        return a+b;
    }
    static int Add(int []a){
         int sum=0;
        for(int i: a){
            sum+=i;
        }
        return  sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of integer : "+Add(5,20));
        System.out.println("Sum of Double : "+ Add(10.0,20.0));
        System.out.println("Sum of Array : " +Add(new int[]{1,2,3,4,5,}));
    }

}
