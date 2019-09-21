package day04_constructor;

public class Calc {

    public Calc() {
        this(3);
        System.out.println("A:");
    }
    
    public Calc(int x) {
        this(3.14);
        System.out.println("B:" + x);
    }
    
    public Calc(double y) {
        this("PI");
        System.out.println("C:" + y);
    }
    
    public Calc(String s) {
        System.out.println("D:" + s);
    }
    
}
