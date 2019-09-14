package day03_array;

import java.util.stream.IntStream;

public class ReduceDemo {
    public static void main(String[] args) {
        int[] scoresSorted = {10, 20, 30, 40, 50, 60};
        
        IntStream.range(1, scoresSorted.length-1).forEach(i -> System.out.println(scoresSorted[i]));
        int sum   = IntStream.range(1, scoresSorted.length-1).reduce(0, (total, i) -> total + scoresSorted[i]);
        int count = (int)IntStream.range(1, scoresSorted.length-1).count();
        System.out.println((double)sum/count);
    }
    
    
    
}
