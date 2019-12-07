package day13_concurrency;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo2 {
    
    public static void main(String[] args) throws Exception {
        Callable shortJob = () -> {
            System.out.println("短任務");
            return null;
        };
        
        Callable longJob = () -> {
            System.out.println("長任務-開始");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("長任務-結束");
            return null;
        };
        
        ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool(); // .newFixedThreadPool(2);
        exec.submit(shortJob);
        exec.submit(longJob);
        exec.submit(longJob);
        exec.submit(shortJob);
        exec.submit(shortJob);
        exec.shutdown();
        
        while(!exec.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("任務持續執行中...");
        }
        
        System.out.println("任務完成");
    }
}
