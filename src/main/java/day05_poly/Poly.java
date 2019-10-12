package day05_poly;

class Employee {
    public int getSalary() {
        return 3_0000;
    }
}

class Manager extends Employee {
    public int getSalary() {
        return 5_0000;
    }

    public int budget() {
        return 10_0000;
    }

}

class Director extends Manager {
    public int getSalary() {
        return 20_0000;
    }

    public int budget() {
        return 100_0000;
    }
    
    public int stockoptions() {
        return 500_0000;
    }
}

public class Poly {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        printSalary(director);
    }
    public static void printSalary(Employee employee) {
        System.out.println("薪資: $" + employee.getSalary());
    }
}
