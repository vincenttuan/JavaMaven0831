package day11_thread;

import java.util.Random;

public class Lucky extends Thread {
    public static int luckyNumber = 777;
    public Lucky(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        int i = 1;
        for (; true ; i++) {
            int n = new Random().nextInt(1000);
            if(n == luckyNumber) {
                break;
            }
        }
        System.out.printf("%s 執行了 %d 次 才得到 %d\n", tName, i, luckyNumber);
    }
    
}
