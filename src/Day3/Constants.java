package Day3;

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