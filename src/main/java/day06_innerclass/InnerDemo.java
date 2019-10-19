package day06_innerclass;

public class InnerDemo {
    public static void main(String[] args) {
        Department dept = new Department("IT");
        Department.Job job = dept.new Job();
        System.out.println(job.getName());
        System.out.println(job.getLanguage());
    }
}
