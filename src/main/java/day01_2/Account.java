package day01_2;

public class Account {
    private String name;
    private int balance;
    private int password = 1234;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBalance(int money) { // 存提款功能
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
