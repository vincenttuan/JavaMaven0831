package day11_thread2;

public class Play {
    public static void main(String[] args) {
        Walking w1 = new Walking();
        Running r1 = new Running();
        
        Thread t1 = new Thread(r1, "小明");
        Thread t2 = new Thread(w1, "Mary");
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
