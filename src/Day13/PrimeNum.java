//Write a method to check if a number is prime.
// Test cases should cover boundary values like 0, 1, negative numbers, and large primes.
package Day13;

public class PrimeNum {
    public boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i=2;i<Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
