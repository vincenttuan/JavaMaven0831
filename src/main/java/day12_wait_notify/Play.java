package day12_wait_notify;

import java.util.stream.IntStream;

public class Play {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        Runnable eat = () -> IntStream.rangeClosed(1, 10).forEach(n -> cookie.eat(n));
        Runnable put = () -> IntStream.rangeClosed(1, 10).forEach(n -> cookie.put(n));
        
        Thread dog = new Thread(eat);
        Thread master = new Thread(put);
        dog.start();
        master.start();
    }
}
