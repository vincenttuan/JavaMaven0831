package day03_array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayDemo {
    public static void main(String[] args) {
        // 0~10
        int[] scores = new int[10];
        // 新增資料
        for(int i=0;i<scores.length;i++) {
            int score = new Random().nextInt(11);
            scores[i] = score;
        }
        // 顯示資料 1 (for-loop)
        for(int i=0;i<scores.length;i++) {
            System.out.printf("%d ", scores[i]);
        }
        System.out.println();
        
        // 顯示資料 2 (for-in, for-each)
        for(int score : scores) {
            System.out.printf("%d ", score);
        }
        System.out.println();
        
        // 顯示資料 3 (Java 8 Arrays.stream)
        IntStream intstream = Arrays.stream(scores);
        intstream.forEach(score -> System.out.printf("%d ", score));
        System.out.println();
        
        // 顯示資料 4 (Java 8 Stream.of)
        Stream<int[]> scream = Stream.of(scores);
        scream.flatMapToInt(x -> Arrays.stream(x)).forEach(score -> System.out.printf("%d ", score));
        System.out.println();
    }
}
