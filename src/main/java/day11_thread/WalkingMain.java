package day11_thread;

public class WalkingMain {
    public static void main(String[] args) {
        Walking w1 = new Walking();
        Walking w2 = new Walking();
        w1.setName("小明");
        w2.setName("Mary");
        w1.start();
        w2.start();
    }
}
