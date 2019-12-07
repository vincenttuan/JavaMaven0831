package day13_scheduled;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SingleThreadSchedule {
    public static void main(String[] args) throws Exception {
        Callable<Integer> r = () -> new Random().nextInt(100);
        
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Main 開始排定工作時間: " + new Date());
        ScheduledFuture future = service.schedule(r, 3, TimeUnit.SECONDS);
        System.out.println(future.get());
        service.shutdown();
    }
}
