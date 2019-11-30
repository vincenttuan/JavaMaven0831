package day12_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class Play {
    public static void main(String[] args) {
        int n = 4;
        Runnable r = () -> System.out.println("我們都到齊了, 買茶葉蛋~");
        
        CyclicBarrier cb  = new CyclicBarrier(4, r);
        IntStream.rangeClosed(1, n).forEach(i -> new Car(cb, i).start());
    }
}
