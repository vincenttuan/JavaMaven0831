package day12_synchronized;

public class Account {
    private int balance; // 帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    // 提款方法
    public synchronized void withdraw(int money) {
        // 執行緒(線程)
        String tName = Thread.currentThread().getName();
        // 取得帳戶餘額
        int tmpBalance = getBalance();
        // 提款程序
        tmpBalance -= money;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        if(tmpBalance >= 0) {
            setBalance(tmpBalance);
            System.out.printf("%s 提款: $ %d 成功 帳戶餘額: $ %d\n", tName, money, getBalance());
        } else {
            System.out.printf("%s 提款: $ %d 失敗 帳戶餘額: $ %d\n", tName, money, getBalance());
        }
    }
}
