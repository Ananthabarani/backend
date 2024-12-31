//Create a class Vehicle with a method start().
// Derive a class Car that overrides the start() method. Write a program to demonstrate method overriding.
package Day3.BasicInheritance;
class Vehicle{
    public void start(){
        System.out.println("Vechicle is running");
    }
}
class Car extends Vehicle {
    public void start(){
        super.start();
        System.out.println("Car is running");
    }
}
public class BasicInheritance2 {
    public static void main(String[] args) {
    Car ob=new Car();
    ob.start();

    }
}
