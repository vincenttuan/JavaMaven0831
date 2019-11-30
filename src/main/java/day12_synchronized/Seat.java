package day12_synchronized;

public class Seat {
    private boolean[] seat = new boolean[10];
    
    public void order() {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 去買票\n", tName);
        for(int i=0;i<seat.length;i++) {
            if(!seat[i]) {
                System.out.printf("%s 買到票 座位: %d\n", tName, i);
                seat[i] = true;
            }
        }
    }
    
}
