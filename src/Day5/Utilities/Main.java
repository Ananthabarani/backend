package Utilities;


import Day5.Utilities.Container;
public class Main {
        public static void main(String[] args) {

            Container<Integer> ob1 = new Container<>();
            ob1.setItem(5);
            System.out.println("Integer value: " + ob1.getItem());
            Container<String> ob2 = new Container<>();
            ob2.setItem("Anand, Barani");
            System.out.println("String value: " + ob2.getItem());

            Priority priority = Priority.HIGH;
            System.out.println("Priority: " + priority);
        }
    enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }
}
