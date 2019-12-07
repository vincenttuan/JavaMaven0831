package day13_concurrency;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorDemo {
    
    public static void main(String[] args) throws Exception {
        Runnable r = () -> System.out.println(new Random().nextInt(100));
        Callable<Integer> c = () -> new Random().nextInt(100);
        
        ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool(); // .newFixedThreadPool(2);
        Future f1 = exec.submit(r);
        System.out.println("f1: " + f1.get());
        
        Future<Integer> f2 = exec.submit(c);
        System.out.println("f2: " + f2.get());
        
        exec.shutdown();
    }
}
