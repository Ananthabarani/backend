//Create a program that uses a Queue to manage a Customer Support System. The program should:
//Add customers to the queue as they arrive.
//Serve customers in the order they arrived (FIFO - First In, First Out).
//Display the list of waiting customers.
package Day10.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                Queue<String> queue = new LinkedList<>();
                int n=sc.nextInt();
                sc.nextLine();
                for(int i=0;i<n;i++){
                    queue.add(sc.nextLine());
                }
                System.out.println("Serving:"+queue.poll());
                System.out.println("Waring:"+queue);
            }
        }