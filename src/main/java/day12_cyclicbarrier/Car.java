package day12_cyclicbarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
    private CyclicBarrier cb;
    private int carNo;
    public Car(CyclicBarrier cb, int carNo) {
        this.cb = cb;
        this.carNo = carNo;
    }

    @Override
    public void run() {
        System.out.printf("(%d 號車) 從台北出發\n", carNo);
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("(%d 號車) 到台中了\n", carNo);
            cb.await();
        } catch (Exception e) {
        }
        System.out.printf("(%d 號車) 繼續往高雄出發...\n", carNo);
    }
    
}
