package day13_scheduled;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SingleThreadScheduleFixedDelay {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        
        Runnable r = () -> {
            Callable<Integer> c = () -> {
                return new Random().nextInt(100);
            };
            FutureTask<Integer> task = new FutureTask<>(c);
            new Thread(task).start();
            try {
                int result = task.get();
                System.out.println(result);
                if(isPrime(result)) {
                    service.shutdown();
                }
            } catch (Exception e) {
            }
        };
        
        System.out.println("Main 開始排定工作時間: " + new Date());
        //service.scheduleWithFixedDelay(r, 2, 1, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(r, 2, 1, TimeUnit.SECONDS);
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
