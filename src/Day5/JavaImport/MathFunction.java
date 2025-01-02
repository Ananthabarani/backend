//Use Math class methods like sqrt() and pow() in a program to calculate the hypotenuse of a
// right-angled triangle using static imports.


package Day5.JavaImport;
import java.util.*;

import  static java.lang.Math.sqrt;
import  static java.lang.Math.pow;
public class MathFunction {
public static void calculate(int a,int b){
    System.out.println("Hypotenus Value :" +sqrt(pow(a,2)+pow(b,2)));
}

    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        calculate(s.nextInt(),s.nextInt());
    }
}
