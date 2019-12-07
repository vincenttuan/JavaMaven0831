package day13_forkjoin;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumTask2 {
    public static void main(String[] args) {
        int result2 = Stream.of(1,2,3,4,5,6)
                .parallel() //.sequential()
                .reduce((sum, n) -> {
                    System.out.printf("sum=%d, n=%d\n", sum, n);
                    return sum+n;
                })
                .get();
        System.out.println(result2);
    }
}
