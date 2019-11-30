package day12_callable;

import java.util.concurrent.Callable;

public class FibonacciCallable implements Callable<Long> {
    long n;
    
    public FibonacciCallable(long n) {
        this.n = n;
    }

    @Override
    public Long call() throws Exception {
        Fibonacci f = new Fibonacci();
        return f.fib(n);
    }
    
}
