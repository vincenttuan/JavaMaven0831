package pattern.builder;

import java.util.stream.IntStream;

public class CycleArea {
    public static void main(String[] args) {
        
        int[] rr = {3, 6, 9, 12, 15, 18, 20};
        
        IntStream.of(rr)
                .filter(r -> r > 10 && r < 20)
                .mapToDouble(r -> Math.pow(r, 2) * Math.PI)
                .filter(area -> area < 1000)
                .forEach(System.out::println);
        
    }
}
