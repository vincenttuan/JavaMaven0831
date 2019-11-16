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
        
    }
}
