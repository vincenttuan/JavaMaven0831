package day13_lock;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Lotto implements Runnable {

    static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            lock.lock();
            String tName = Thread.currentThread().getName();
            IntStream.rangeClosed(1, 5).forEach(i -> {
                System.out.println(i + "-(" + tName + "):" + new Random().nextInt(100));
            });
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }

}
