package day07_innerclass;

public class Salary {
    private int money;
    private String level;

    public Salary(String level, int money) {
        this.level = level;
        this.money = money;
    }

    public int getMoney() {
        return money * Level.getPriority(level);
    }
    
    static class Level {
        static int getPriority(String level) {
            switch(level) {
                case "manager":
                    return 2;
                case "supervisor":
                    return 5;
                default:
                    return 1;
            }
        }
    }
    
}
