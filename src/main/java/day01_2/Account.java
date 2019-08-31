package day01_2;

public class Account {
    private String name;
    private int balance;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBalance(int money) {
        if(money >= 0) {
            balance = money;
        }
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    
    
    
    
    
}
