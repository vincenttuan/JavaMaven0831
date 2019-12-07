package day13_forkjoin;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prime {
    public static void main(String[] args) {
        long count = Stream.iterate(0, n -> n + 1)
                .limit(100)
                .parallel()
                .filter(Prime::isPrime) // (n -> isPrime(n))
                .peek(System.out::println)
                .count();
        System.out.println("count: " + count);        
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
    
}
