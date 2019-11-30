package day12_wait_notify;

public class Fish {
    private boolean empty = true;
    // 吃魚
    public synchronized void eat(int n) {
        while(empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.printf("小花貓吃了第 %d 條魚\n", n);
        empty = true;
        notifyAll();
    }
    
    // 放魚
    public synchronized void put(int n) {
        while(!empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.printf("女主人放了第 %d 條魚\n", n);
        empty = false;
        notifyAll();
    }
    
}
