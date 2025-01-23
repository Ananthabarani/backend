//Random Supplier Create a Supplier that generates a random number between 1 and 100 and prints it 5 times.

package Day17.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {
    public static void main(String[] args) {
        Random random1=new Random();
        Supplier<Integer> random=()->random1.nextInt(101);
        for(int i=0;i<5;i++) {
            System.out.println(random.get());
        }
    }
}
