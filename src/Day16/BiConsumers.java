//Create a BiConsumer<Integer, Integer> that takes two numbers and prints their sum.
package Day16;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumers {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(4, 2);
        map.put(5, 2);
        BiConsumer<Integer, Integer> bicon = (i, j) -> System.out.println(" Sum of Key and Value: " + (i + j));

        map.forEach(bicon);
    }
}
