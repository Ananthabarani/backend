//Write a program using CompletableFuture to simulate the following tasks:
//Task 1: Fetch user data (simulate with a Thread.sleep()).
//Task 2: Fetch user orders (simulate with a Thread.sleep()).
//Combine the results of both tasks and print the user details along with the orders.
package Day19.CompletableFuture;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> userDataFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Fetching user data...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Anand";
        });
        CompletableFuture<String> userOrdersFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Fetching user orders...");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Order";
        });
         CompletableFuture<String> combinedFuture = userDataFuture.thenCombine(userOrdersFuture, CompletableFutureExample::combineResults);
        try {
            System.out.println("Combined Result:\n" + combinedFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
    private static String combineResults(String userData, String userOrders) {
        return userData + " " + userOrders;
    }
}
