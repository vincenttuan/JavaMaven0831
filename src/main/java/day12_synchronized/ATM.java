package day12_synchronized;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        System.out.println(account.getBalance());
        
        Thread t1 = new Thread(new Withdraw(account, 6000), "John");
        Thread t2 = new Thread(new Withdraw(account, 3000), "Tom");
        Thread t3 = new Thread(new Withdraw(account, 2000), "Mary");
        t1.start();
        t2.start();
        t3.start();
    }
}
