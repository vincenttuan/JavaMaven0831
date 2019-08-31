package day01_2;

public class Bank {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.setName("John");
        ac1.setBalance(100);
        ac1.setBalance(100);
        ac1.setBalance(-50);
        ac1.setBalance(100);
        ac1.setBalance(-500);
        ac1.setBalance(300);
        System.out.println(ac1.getName());
        System.out.println(ac1.getBalance(1234));
    }
}
