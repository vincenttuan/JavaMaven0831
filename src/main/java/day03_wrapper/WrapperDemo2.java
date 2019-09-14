package day03_wrapper;

public class WrapperDemo2 {
    public static void main(String[] args) {
        int x = 100;
        Integer y = Integer.valueOf("200"); // new Integer("200")
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y.intValue()); // java 5 以前
        System.out.println(x + y); // java 5 以後 y -> y.intValue() auto-unboxing 自動拆箱
        
        Integer a = Integer.valueOf("300"); // java 5 以前
        Integer b = 300; // java 5 以後 300 -> Integer.valueOf("300") auto-boxing 自動裝箱
        System.out.println(x + y.intValue() + a.intValue() + b.intValue());
        System.out.println(x + y + a + b);
        
        Integer c = 400;
        c = 500;
        System.out.println(c);
    }
}
