package day07_innerclass;

import java.util.Arrays;
import java.util.List;

public class FuncDemo {
    private static List<Integer> scores;
    static {
        scores = Arrays.asList(100, 43, 87, 35, 11, 92);
    }
    
    public static void main(String[] args) {
        
        scores.stream().filter(t -> t >= 60).forEach(t -> System.out.println(t));
        scores.stream().filter(t -> t >= 60).forEach(System.out::println);
        
    }
    
    
}
