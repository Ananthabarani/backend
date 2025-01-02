//Create a method sum(int... numbers) that takes a variable number of integers as input and returns their sum.
// Test it with different numbers of arguments.

package Day5.AutoboxingandVarargs;

public class Varargs {

   public static void sum(int... val){
       int sum=0;
        for(int i:val){
            sum+=i;
        }
       System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(1,2,3,4,5);
    }
}
