package day06_innerclass;

public class Person  {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    class Student {
        public String job() {
            return "讀書";
        }
    }
    
    class Soldier {
        public String job() {
            return "保衛國家";
        }
    }
    
    class Father {
        public String job() {
            return "賺錢養家";
        }
    }
    
    // 主程式
    public static void main(String[] args) {
        Person person = new Person("John");
        System.out.println(person.name);
        Person.Student student = person.new Student();
        Person.Soldier soldier = person.new Soldier();
        Person.Father father = person.new Father();
        System.out.println(student.job());
        System.out.println(soldier.job());
        System.out.println(father.job());
    }
    
}
