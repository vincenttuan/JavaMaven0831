package day03_multi_array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiArrayDemo {
    public static void main(String[] args) {
        
        int[][] group = {
            {100, 90, 80},
            {95, 80, 75}
        };
        
        System.out.println(group);
        System.out.println(group[0]);
        System.out.println(group[0][0]);
        
        // Java 7
        for (int[] scores : group) {
            int sum = 0;
            double avg = 0;
            for (int score : scores) {
                sum += score;
            }
            avg = (double)sum / scores.length;
            System.out.printf("總分: %d, 平均: %.2f\n", sum, avg);
        }
        
        // Java 8
        IntStream.range(0, group.length).forEach(i -> {
            int sum = Arrays.stream(group[i]).sum();
            double avg = Arrays.stream(group[i]).average().getAsDouble();
            System.out.printf("總分: %d, 平均: %.2f\n", sum, avg);
        });
    }
}
