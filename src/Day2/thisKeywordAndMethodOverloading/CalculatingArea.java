//Write a program that has multiple overloaded methods for calculating
//the area of a rectangle, circle, and triangle.
package Day2.thisKeywordAndMethodOverloading;

public class CalculatingArea {
     static double Area(double length,double breath){
        return length*breath;
    }
    static double Area(double radius){
        return Math.PI*(radius*radius);
    }
    static float Area(float  breath,float  height){
    return (breath*height)/2;
    }

    public static void main(String[] args) {
        System.out.println("Area of Rectangle : "+Area(5.0,6.0)  );
        System.out.println("Area of Circle : "+Area(6));
        System.out.println("Area of Triangle : "+Area(4f,6f));
    }

}
