//Create a package shapes with two classes:
//Circle with a method to calculate the area of a circle.
//Rectangle with a method to calculate the area of a rectangle.
//Write a Main class in the default package to import and use these classes.


package Day5.JavaImport.Shape;
import  static java.lang.Math.PI;
public class Circle {
   public static double calculate(double r){
       return (PI)*(r*r);
   }
}
