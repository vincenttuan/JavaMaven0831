package day11_thread2;

public class Running implements Runnable {

    @Override
    public void run() {
        job();
    }
    
    public void job() {
        String tName = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑了 %d 步\n", tName, i);
        }
    }
    
}
