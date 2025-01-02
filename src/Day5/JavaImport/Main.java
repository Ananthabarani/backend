package Day5.JavaImport;


import Day5.JavaImport.Shape.Circle;
import Day5.JavaImport.Shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Circle Area: "+Circle.calculate((int) 3));
        System.out.println( "Rectangle: "+Rectangle.calculate(2,3));
    }
}