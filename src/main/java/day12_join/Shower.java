package day12_join;

import java.util.stream.IntStream;

public class Shower {
    public static void main(String[] args) {
        Father father = new Father();
        father.start();
    }
}

class Father extends Thread {

    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒熱水");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯");
        Worker worker = new Worker();
        worker.start();
        
        try {
            worker.join(10_000);
        } catch (Exception e) {
        }
        
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
    
}

class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("工人開始送瓦斯");
        IntStream.rangeClosed(1, 5).forEach(i -> {
            try {
                Thread.sleep(1000);
                System.out.print(i + " 秒鐘\t");
            } catch (Exception e) {
                System.out.println("\n工人發生意外");
                return;
            }
        });
        System.out.println("\n工人將瓦斯送到家了");
        
    }
}

