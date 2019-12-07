package day13_forkjoin;

import java.util.stream.Stream;

public class Fib {

    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(10)
                .forEach(s -> System.out.printf("%d\n", s[0]));
        
    }
}
