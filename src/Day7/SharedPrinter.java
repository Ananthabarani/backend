package Day7;//Object and method locking
//Write a Java program to demonstrate object-level and method-level locking using multithreading. The program should:
//Create a shared resource class (e.g., Day7.SharedPrinter) with two synchronized methods:
//Method 1: Print a given string multiple times.
//Method 2: Print a countdown from a given number.
//Use two threads:
//Thread 1: Calls the first synchronized method (print string).
//Thread 2: Calls the second synchronized method (countdown).
//Demonstrate the difference between:
//Object-Level Locking: When both threads use the same instance of the shared resource.
//Class-Level Locking: When both threads use a static synchronized method or block.
//Show how the locks affect the execution order of the m



//CLL -> Class Level Locking
//OLL -> Obiect level Locking
class SharedPrinter {
    //OLL

    public synchronized void printString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void countdown(int num) {
        for (int i = num; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //CLL
    public static synchronized void staticPrintString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void staticCountdown(int num) {
        for (int i = num; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter();
        // Object-level locking with the same instance
        Thread thread1 = new Thread(() -> sharedPrinter.printString("Hello"));
        Thread thread2 = new Thread(() -> sharedPrinter.countdown(5));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                SharedPrinter.staticPrintString("Hello");
            }
        });
        Thread thread4 = new Thread(() -> sharedPrinter.countdown(5));

        thread3.start();
        thread4.start();
    }
}
