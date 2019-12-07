package day13_atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AtomicTest {
    static AtomicInteger count = new AtomicInteger(0);
    
    public static void main(String[] args) {
        Runnable r = () -> {
            count.incrementAndGet();
            System.out.println(count.get());
        };
        
        Stream.of(new Thread(r), new Thread(r), new Thread(r))
                .forEach(t -> t.start());
        
    }
}
