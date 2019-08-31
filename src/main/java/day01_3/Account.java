package day01_3;

public class Account {
    private String name;
    private int balance;
    private int password = 1234;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBalance(int money, int password) { // 存提款功能
        // 提款要檢查 password
        if(money < 0 && this.password != password) {
            System.out.println("密碼不正確 !");
            return;
        }
        
        // 存提款作業程序
        int diff = balance + money;
        if(diff >= 0) {
            balance = diff;
            String word = (money >= 0) ? "存" : "提";
            System.out.print("\u001B[30m");
            System.out.printf("%s款成功, 餘額: $%d, %s款: $%d\n", word, balance, word, Math.abs(money));
        } else {
            System.out.print("\u001B[31m");
            System.out.printf("存款不足, 餘額: $%d, 提款: $%d\n", balance, Math.abs(money));
        }
    }
    
    public String getName() {
        return name;
    }

    public int getBalance(int password) {
        if(this.password == password) {
            return balance;
        } else {
            System.out.println("密碼錯誤");
            return 0;
        }
    }
    
}