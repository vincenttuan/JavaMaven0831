package day01_4.bar;

import day01_4.foo.Tom;

public class John extends Tom {
    public int money = 1000;
    
    public void printMoney() {
        System.out.println("John: $" + this.money);
        Mary mary = new Mary();
        System.out.println("Mary: $" + mary.money);
        System.out.println("Tom: $" + super.money);
    }
    
    public static void main(String[] args) {
        John john = new John();
        john.printMoney();
    }
}
