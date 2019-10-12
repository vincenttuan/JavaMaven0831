package day05_extends;

class Employee {
    public int salary;
}

class Manager extends Employee {
    public int budget;
}

class Director extends Manager {
    public int stockOptions;
}

public class Extends {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        
        Employee director1 = new Director();
        Manager director2 = new Director();
        Director director3 = new Director();
        // line 1
        /*
        Which two options fail to compile when placed at line n1 of the main method?
        A.
        employee.salary = 50_000;
        B.
        director.salary = 80_000;
        C.
        employee.budget = 200_000;
        D.
        manager.budget = 1_000_000;
        E.
        manager.stockOption = 500;
        F.
        director.stockOptions = 1_000;
        */
    }
}