package day13_forkjoin;

import java.util.stream.Stream;

public class Fib2 {

    public static void main(String[] args) {
        double result = Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                            .limit(10)
                            //.parallel()
                            .mapToDouble(s -> s[0])
                            .reduce((sum, n) -> n)
                            .getAsDouble();
        System.out.println((int)result);
    }
}
