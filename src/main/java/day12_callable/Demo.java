package day12_callable;

import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws Exception{
        long n = 6;
        long result = 0;
        long sum = 0;
        FibonacciCallable fib;
        FutureTask<Long> task;
        
        fib = new FibonacciCallable(n);
        task = new FutureTask<>(fib);
        new Thread(task).start();
        System.out.println("計算中...");
        result = task.get();
        sum += result;
        System.out.printf("fib(%d) = %d\n", n, result);
        
        n = result;
        fib = new FibonacciCallable(n);
        task = new FutureTask<>(fib);
        new Thread(task).start();
        System.out.println("計算中...");
        result = task.get();
        sum += result;
        System.out.printf("fib(%d) = %d\n", n, result);
        
        n = result;
        fib = new FibonacciCallable(n);
        task = new FutureTask<>(fib);
        new Thread(task).start();
        System.out.println("計算中...");
        result = task.get();
        sum += result;
        System.out.printf("fib(%d) = %d\n", n, result);
        
        System.out.printf("sum = %d\n", sum);
        
    }
}
