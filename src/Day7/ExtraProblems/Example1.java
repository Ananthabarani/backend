package Day7.ExtraProblems;//Write the following code in your editor below:
//
//A class named Day7.ExtraProblems.Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
//A class named Day7.ExtraProblems.Adder that inherits from a superclass named Day7.ExtraProblems.Arithmetic.
//Your classes should not be be .


class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class Example1 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("Sum: " + adder.add(3, 5));  // Output: Sum: 8
    }
}
