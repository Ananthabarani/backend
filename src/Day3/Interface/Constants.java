//Define an interface Constants with static fields like PI = 3.14.
//Create a class Circle that uses this constant to calculate the area of a circle.
package Day3.Interface;

import java.util.Scanner;

public interface Constants {
    double pi=3.14;
}
  class Circle1 implements Constants{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        double r=s.nextDouble();
        System.out.println((pi)*(r*r));
    }
}