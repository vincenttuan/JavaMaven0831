package day10_collection2;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class PersonMain {
    static List<Person> javaProgrammers = PersonUtil.getJavaProgrammers();
    static List<Person> phpProgrammers = PersonUtil.getPHPProgrammers();
    
    public static void main(String[] args) {
        System.out.println("java Programmers: ");
        javaProgrammers.forEach(e -> System.out.print(e));
        System.out.println("\nphp Programmers: ");
        phpProgrammers.forEach(System.out::print);
        System.out.println();
        
        // 1.Java 與 Php 各別薪資總和 ?
        int javaSalary = javaProgrammers.stream().mapToInt(x -> x.getSalary()).sum();
        int phpSalary = phpProgrammers.stream().mapToInt(x -> x.getSalary()).sum();
        System.out.printf("1.Java 與 Php 各別薪資總和? %,d, %,d, %s 多\n", javaSalary, phpSalary, (javaSalary > phpSalary)?"Java":"php");
        
        // 2.女性在 Java 與 Php 各別平均薪資 ?
        Predicate<Person> filterFemale = x -> x.getGender().equals("female");
        ToIntFunction<Person> toSalary = x -> x.getSalary();
        double javaFemaleSalaryAvg = javaProgrammers.stream()
                .filter(filterFemale)
                .mapToInt(toSalary)
                .average()
                .getAsDouble();
        double phpFemaleSalaryAvg = phpProgrammers.stream()
                .filter(filterFemale)
                .mapToInt(toSalary)
                .average()
                .getAsDouble();
        System.out.printf("2.女性在 Java 的平均薪資: %.2f 在 Php 的平均薪資: %.2f, %s 高\n", javaFemaleSalaryAvg, phpFemaleSalaryAvg, (javaFemaleSalaryAvg > phpFemaleSalaryAvg)?"Java":"php");
        
        // 3. Java 男性與女性在 30 歲之後的薪資差距 ?
        double male30Avg = javaProgrammers.stream()
                .filter(x -> x.getGender().equals("male"))
                .filter(x -> x.getAge() >= 30)
                .mapToInt(x -> x.getSalary())
                .average().getAsDouble();
        double female30Avg = javaProgrammers.stream()
                .filter(x -> x.getGender().equals("female"))
                .filter(x -> x.getAge() >= 30)
                .mapToInt(x -> x.getSalary())
                .average().getAsDouble();
        double maleFemaleInterval = male30Avg - female30Avg;        
        System.out.printf("3.30 歲之後 Java 男性: %.2f 女性: %.2f 薪資差距: %.2f, %s 高\n", 
                male30Avg, female30Avg, Math.abs(maleFemaleInterval), (maleFemaleInterval > 0)?"男性":"女性");
        
        // 4.Java 薪資前三名與最高
        System.out.println("Java 薪資前三名: ");
        javaProgrammers.stream()
                .sorted((x1, x2) -> x2.getSalary() - x1.getSalary())
                .limit(3)
                .forEach(System.out::println);
        
        Person maxSalaryJava = javaProgrammers.stream()
                .max((x1, x2) -> x1.getSalary() - x2.getSalary())
                .get();
        System.out.printf("Java 薪資最高: %s\n", maxSalaryJava);
        
        // 5.小明 男生 31 歲
        Person javaPerson = javaProgrammers.stream()
                .filter(x -> x.getAge() <= 31 && x.getGender().equals("male"))
                .max((x1, x2) -> x1.getSalary() - x2.getSalary())
                .get();
        Person phpPerson = phpProgrammers.stream()
                .filter(x -> x.getAge() <= 31 && x.getGender().equals("male"))
                .max((x1, x2) -> x1.getSalary() - x2.getSalary())
                .get();
        System.out.println(javaPerson + "\n" + phpPerson);
        System.out.printf("java $%d php $%d %s 薪資較優\n",
                javaPerson.getSalary(), phpPerson.getSalary(), (javaPerson.getSalary()-phpPerson.getSalary()>0)?"java":"php");
        
    }
}
