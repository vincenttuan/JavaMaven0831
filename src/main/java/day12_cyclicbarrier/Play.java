package day12_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class Play {
    public static void main(String[] args) {
        int n = 4;
        CyclicBarrier cb  = new CyclicBarrier(4);
        IntStream.rangeClosed(1, n).forEach(i -> new Car(cb, i).start());
    }
}
