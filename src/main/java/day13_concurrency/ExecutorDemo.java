package day13_concurrency;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;

class MyExecutor implements Executor {
    @Override
    public void execute(Runnable r) {
        new Thread(r).start();
    }
}

public class ExecutorDemo {
    public static void main(String[] args) {
        Runnable r1 = () -> {System.out.println(new Date());};
        Runnable r2 = () -> {
            Set<Integer> lottos = new LinkedHashSet<>();
            while(lottos.size() < 5) {
                lottos.add(new Random().nextInt(39) + 1);
            }
            System.out.println(lottos);
        };
        
        Executor exec = new MyExecutor();
        exec.execute(r1);
        exec.execute(r1);
        exec.execute(r1);
        exec.execute(r2);
        exec.execute(() -> System.out.println(1+5));
        exec.execute(() -> System.out.println(1+5));
        exec.execute(() -> System.out.println(60.0/Math.pow(170.0/100, 2)));
        exec.execute(() -> System.out.println(60.0/Math.pow(170.0/100, 2)));
        exec.execute(() -> System.out.println(60.0/Math.pow(170.0/100, 2)));
        exec.execute(() -> System.out.println(60.0/Math.pow(170.0/100, 2)));
        exec.execute(r2);
        exec.execute(r2);
        exec.execute(r2);
    }
}
