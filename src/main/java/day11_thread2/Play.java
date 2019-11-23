package day11_thread2;

public class Play {
    public static void main(String[] args) {
        Walking w1 = new Walking();
        Running r1 = new Running();
        
        Thread t1 = new Thread(r1, "小明");
        t1.start();
    }
}
