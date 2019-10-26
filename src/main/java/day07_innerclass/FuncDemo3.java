package day07_innerclass;

import java.util.stream.Stream;

public class FuncDemo3 {

    public static void main(String[] args) {
        System.out.println(
            Stream.of(100, 90, 50)
                    .filter(e -> e >= 60)
                    .peek(System.out::println)
                    .count()
        );
    }
        
}
