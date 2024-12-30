package Day3;
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
