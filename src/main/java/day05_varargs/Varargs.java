package day05_varargs;

import java.util.stream.IntStream;

public class Varargs {
    public static void main(String[] args) {
        int[] nums = {100, 90, 80};
        System.out.println(calc(nums));
        System.out.println(calc(100, 90, 80));
        System.out.println(calc());
        System.out.println(calc7(nums));
        System.out.println(calc7(100, 90, 80));
        System.out.println(calc7());
    }
    
    public static int calc(int... nums) {
        // Java 8
        return IntStream.of(nums).sum();
    }
    
    public static int calc7(int... nums) {
        // Java 7
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }
}
