package day01_3;

public class Bank {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.setName("John");
        ac1.setBalance(100, 0); // 存款
        ac1.setBalance(-50, 234);  // 提款
        System.out.println(ac1.getName());
        System.out.println(ac1.getBalance(1234));
    }
}
