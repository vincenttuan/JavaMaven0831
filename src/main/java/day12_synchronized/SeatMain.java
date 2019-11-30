package day12_synchronized;

public class SeatMain {
    public static void main(String[] args) {
        Seat seat = new Seat();
        Runnable r1 = () -> seat.order();
        Runnable r2 = () -> seat.order();
        
        new Thread(r1, "小明").start();
        new Thread(r2, "Mary").start();
    }
}
