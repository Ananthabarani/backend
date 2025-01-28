package Day19.CallableAndFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class ExecutorsExample {
    public static int count = 0;

    public static void main(String[] args) {

        try(ExecutorService executor = Executors.newFixedThreadPool(5)){

            Stream.iterate(0, n -> n < 10, n -> n+1).forEach(
                    i -> {
                        executor.submit(() ->{
                            System.out.println("New Task Invoked : " + ++count);
                            Stream.iterate(1, n -> n <= 10, n -> n + 1)
                                    .map(j -> count * j)
                                    .forEach(System.out::println);
                        });
                    }
            );
            executor.shutdown();
            while(!executor.isTerminated()){

            }
        }

        System.out.println("terminat!");
    }

}