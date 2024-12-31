//Create a class Shape with a method area().
// Derive a class Rectangle with attributes length and breadth, and override the area() method. Further, derive a class Square from Rectangle and demonstrate multilevel inheritance.

        package Day3.BasicInheritance;
import java.util.*;
public class Shape1{
    void area1(){
        System.out.println("Area of shape:");
    }
}
class Rectangle1 extends Shape1{
    public int length;
    public int breadth;
    Rectangle1(){
        this.length=5;
        this.breadth=10;
    }
    void area1(){
        super.area1();
        System.out.println("Area of rectangle:"+(length*breadth));
    }
}
class Square extends Rectangle1{
    int side;
    Square(int n){
        this.side=n;
    }
     void area1(){
        super.area1();
        System.out.println("Area of circle:"+side*side);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Square circle=new Square(sc.nextInt());
        circle.area1();
    }
}