package day03_array;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 0~10
        int[] scores = new int[10];
        // 新增資料 Java 8
        IntStream.range(0, scores.length).forEach(i -> {
            scores[i] =  new Random().nextInt(11);
            System.out.printf("%d ", scores[i]);
        });
        System.out.println("\n------------------------");
        
        // 排序
        IntStream intStream = Arrays.stream(scores).sorted();
        int[] scoresSorted = intStream.toArray(); // 已排序
        
        // 印出排序資料
        IntStream.range(0, scoresSorted.length).forEach(i -> {
            System.out.printf("%d ", scoresSorted[i]);
        });
        System.out.println();
        
        // 印出排序資料(扣掉頭尾)
        IntStream.range(1, scoresSorted.length-1).forEach(i -> {
            System.out.printf("%d ", scoresSorted[i]);
        });
        System.out.println();
        
        // 平均
        int sum = IntStream.range(1, scoresSorted.length-1).reduce(0, (subtotal, i) -> subtotal + scoresSorted[i]);
        long count = IntStream.range(1, scoresSorted.length-1).count();
        double avg = (double)sum / count;
        System.out.printf("平均: %.2f\n", avg);
    }
}
