//Create a method to calculate the factorial of a number.
// Include test cases for zero, small positive numbers, and invalid inputs (e.g., negative numbers).
package Day13;

public class Factorial {

        public long findfact(int num){
            if (num<0){
                return -1;
            }
            if (num==0){
                return 1;
            }
            long fact=1;
            for (int i=1;i<=num;i++){
                fact*=i;
            }
            return fact;
        }
    }
