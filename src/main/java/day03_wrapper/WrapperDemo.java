package day03_wrapper;

public class WrapperDemo {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        System.out.println(x);
        
        int max = Integer.max(10, 20);
        System.out.println(max);
        
        String a = "200";
        int int_a = Integer.parseInt(a);
        System.out.println(int_a * 2);
        
    }
}
