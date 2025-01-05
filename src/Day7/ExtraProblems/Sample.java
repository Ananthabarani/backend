package Day7.ExtraProblems;
//A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism.
// In this problem, you will practice your knowledge on interfaces.
//You are given an interface Day7.ExtraProblems.AdvancedArithmetic which contains a method signature int divisor_sum(int n).
// You need to write a class called Day7.ExtraProblems.MyCalculator which implements the interface.
//divisorSum function just takes an integer as input and return the sum of all its divisors.
// For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
//Read the partially completed code in the editor and complete it.
// You just need to write the Day7.ExtraProblems.MyCalculator class only. Your class shouldn't be public.

interface AdvancedArithmetic {
    int sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Sample{
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        int n = 6;
        System.out.println("Sum of divisors of " + n + ": " + myCalculator.sum(n));  // Output: 12
    }
}