package day02_dynarray;

// 動態陣列分析

import java.util.Arrays;
import java.util.List;

public class DynArray {
    public static void main(String[] args) {
        // 靜態陣列
        int[] scores = {100, 90, 80};
        for(int i=0;i<scores.length;i++) {
            System.out.println(scores[i]);
        }
        
        // 動態陣列 + Java 8
        List scores2 = Arrays.asList(100, 90, 80);
        scores2.forEach(x -> System.out.println(x));
        scores2.forEach(System.out::println); // x -> System.out.println(x)
        
        // 動態陣列 + Java 8 + stream (cpu 運算)
        List<Integer> scores3 = Arrays.asList(100, 30, 80, 50, 70);
        scores3.stream().filter(x -> x >= 60).forEach(System.out::println);
    }
}
