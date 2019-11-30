package day12_wait_notify;

import java.util.stream.IntStream;

public class Play {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        Fish fish = new Fish();
        Runnable eat = () -> IntStream.rangeClosed(1, 10).forEach(n -> cookie.eat(n));
        Runnable put = () -> IntStream.rangeClosed(1, 10).forEach(n -> cookie.put(n));
        Runnable eat2 = () -> IntStream.rangeClosed(1, 10).forEach(n -> fish.eat(n));
        Runnable put2 = () -> IntStream.rangeClosed(1, 10).forEach(n -> fish.put(n));
        
        Thread dog = new Thread(eat);
        Thread master = new Thread(put);
        Thread cat = new Thread(eat2);
        Thread mam = new Thread(put2);
        
        dog.start();
        cat.start();
        master.start();
        mam.start();
    }
}
