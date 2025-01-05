package Day7;//Threads - Intro
//Write a Java program to demonstrate the use of multithreading. The program should:
//Create two threads:
//Thread 1: Print numbers from 1 to 10 with a 500ms delay between each number.
//Thread 2: Print the square of numbers from 1 to 10 with a 700ms delay between each number.
//Ensure both threads run concurrently.
//Use Thread class or Runnable interface for thread implementation.

class Number extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Day7.Number: " + i);
                Thread.sleep(500); // 500ms delay
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}
class Square extends Thread {
  @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Day7.Square of " + i + ": " + (i * i));
                Thread.sleep(700); // 700ms delay
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        Number numberThread = new Number();
        Square squareThread = new Square();
        numberThread.start();
        squareThread.start();
    }
}
