//Create a program that uses a Stack to implement an Undo feature for a text editor. The program should:
//Allow the user to perform actions like typing words (e.g., "Hello", "World").
//Store each action in the stack.
//Undo the last action by popping it from the stack.
package Day10.Stack;
import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
                Stack<String> ll = new Stack<>();
                int n=sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < n; i++) {
                    String str = sc.nextLine();

                    if(str.substring(0,4).equalsIgnoreCase("Type")) {
                        ll.push(str.substring(5));
                    }
                    else{
                        ll.pop();
                    }

                }
                for(String ans:ll){
                    System.out.print(ans+" ");
                }
            }
        }
