package day03_wrapper;

import java.util.Arrays;

public class WrapperDemo3 {
    public static void main(String[] args) {
        String[] scores = {"100", "90", "80"};
        // Java 8
        Arrays.stream(scores).forEach(System.out::println);
        
        int sum = Arrays.stream(scores).mapToInt(s -> Integer.parseInt(s)).sum();
        System.out.println(sum);
        
        
    }
}
