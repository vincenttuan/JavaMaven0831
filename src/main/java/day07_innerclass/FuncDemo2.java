package day07_innerclass;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class FuncDemo2 {
    private static List<Integer> scores;
    static {
        scores = Arrays.asList(100, 80, 50, 40, 90);
    }
    
    public static void main(String[] args) {
        
        double sum = scores.stream()
                .mapToDouble(score -> score>=60 ? score * 1.1 : score)
                .peek(System.out::println)
                .sum();
        System.out.println(sum);
        
        double avg = scores.stream()
                .mapToDouble(score -> score>=60 ? score * 1.1 : score)
                .peek(System.out::println)
                .average().getAsDouble();
        System.out.println(avg);
        
        //---------------------------------------------------------------------------------
        DoubleSummaryStatistics stat = scores.stream()
                .mapToDouble(score -> score>=60 ? score * 1.1 : score).summaryStatistics();
        
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
    }
    
    
}
