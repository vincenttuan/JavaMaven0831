package day04_constructor;

public class BallMain {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        System.out.println(b1);
        
        Ball b2 = new Ball("Vincent");
        System.out.println(b2);
    }
}
