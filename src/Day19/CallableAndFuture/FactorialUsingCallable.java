//Write a program to calculate the factorial of a number using Callable and Future.
//Create a FactorialTask class that implements Callable<Long>.
//Use an ExecutorService to submit the task.
//Retrieve the result using the Future.get() method.
package Day19.CallableAndFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialUsingCallable {
    public static void main(String[] args) {

        ExecutorService executor= Executors.newSingleThreadExecutor();
        Callable<Long> fact=new MyCallable();
        Future<Long> future=executor.submit(fact);
        executor.shutdown();
        try {
            Long result = future.get();
            System.out.println("Factorial of is " + result);
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
}
