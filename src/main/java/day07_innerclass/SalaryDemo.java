package day07_innerclass;

public class SalaryDemo {
    public static void main(String[] args) {
        Salary manager_salary = new Salary("manager", 70000);
        System.out.println(manager_salary.getMoney());
        
        Salary.Level level = new Salary.Level();
        System.out.println(level.getPriority("manager"));
    }
}
