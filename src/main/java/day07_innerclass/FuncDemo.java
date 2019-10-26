package day07_innerclass;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FuncDemo {
    private static List<Integer> scores;
    static {
        scores = Arrays.asList(100, 43, 87, 35, 11, 92);
    }
    
    public static void main(String[] args) {
        
        scores.stream().filter(score -> score >= 60).forEach(score -> System.out.println(score));
        scores.stream().filter(score -> score >= 60).forEach(System.out::println);
        
        pass(scores, 60);
        
        pass2(scores, (score -> score >= 60));
        pass2(scores, (score -> score >= 60 && score <= 90 && score % 2 == 1));
    }
    
    public static void pass(List<Integer> scores, int passScore) {
        scores.stream().filter(t -> t >= passScore).forEach(System.out::println);
    }
    
    public static void pass2(List<Integer> scores, Predicate<Integer> passRule) {
        scores.stream().filter(passRule).forEach(System.out::println);
    }
    
    
}
