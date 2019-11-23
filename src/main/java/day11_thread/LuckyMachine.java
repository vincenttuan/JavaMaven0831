package day11_thread;

public class LuckyMachine {
    public static void main(String[] args) {
        Lucky.luckyNumber = 777;
        Lucky lucky1 = new Lucky("小明");
        Lucky lucky2 = new Lucky("Mary");
        lucky1.start();
        lucky2.start();
        
    }
}
