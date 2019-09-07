package day02_algorithm;

public class Fibonacci {
    public long f(long n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return f(n-1) + f(n-2);
    }
    
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.f(10));
        System.out.println(fib.f(10) * 2);
    }
}
