//Given a list of integers, perform the following tasks using parallel streams:
//Filter numbers greater than 50.
//Map these numbers to their squares.
//Print the first 10 squared numbers.
package Day19.ParallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelSreamExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(51,52,53,45,55,56,57,58,59,10,61,62,63);
        list.parallelStream()
                .filter(n -> n>50)
                .map(n -> n*n)
                .limit(10)
                .forEach(System.out::println);
    }
}
