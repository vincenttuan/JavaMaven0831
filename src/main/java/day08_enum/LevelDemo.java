package day08_enum;

public class LevelDemo {
    public static void main(String[] args) {
        System.out.println(getSalary(Level.總經理, 50000));
    }
    
    public static double getSalary(Level level, int money) {
        switch(level) {
            case 經理:
                return money * 1.2;
            case 副總:
                return money * 1.5;
            case 總經理:
                return  money * 3;
            case 董事長:
                return  money * 5;
            default:
                return money;
        }
    }
}
