//Static Method Reference Write a Java program that uses a method reference to a
// static method Math::sqrt to calculate the square root of a list of numbers.
package Day17.MethodReference;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Square {

       public Square() {
           List<Integer> numbers = Arrays.asList(4, 16, 25, 36, 49);
           for (Integer i : numbers) {
               DoubleFunction<Double> doubleDoubleFunction = Math::sqrt;
               Double result =  doubleDoubleFunction.apply(i);
               System.out.println(result);
           }
       }

    public static void main(String[] args) {
        Square sq=new Square();
    }
}

