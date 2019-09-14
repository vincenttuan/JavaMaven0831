package day03_array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 0~10
        int[] scores = new int[10];
        // 新增資料 Java 7
        /*
        for(int i=0;i<scores.length;i++) {
            int score = new Random().nextInt(11);
            scores[i] = score;
            System.out.printf("%d ", score);
        }
        */
        // 新增資料 Java 8
        IntStream.range(0, scores.length).forEach(i -> {
            scores[i] =  new Random().nextInt(11);
            System.out.printf("%d ", scores[i]);
        });
        System.out.println("\n------------------------");
        
        // 去除偶數 總分/平均 (for-in, for-each)
        /*
        int sum = 0;
        double avg = 0;
        int count = 0;
        for(int score : scores) {
            if(score % 2 == 1) {
                sum += score;
                ++count;
            }
        }
        avg = (double)sum/count;
        System.out.printf("總分: %d 平均: %.2f\n", sum, avg);
        */
        
        // 去除偶數 總分/平均 (Java 8)
        int sum2 = Arrays.stream(scores).filter(score -> score % 2 == 1).sum();
        double avg2 = Arrays.stream(scores).filter(score -> score % 2 == 1).average().getAsDouble();
        System.out.printf("總分: %d 平均: %.2f\n", sum2, avg2);
        
    }
}
