package day10_collection2;

import java.util.List;

public class PersonMain {
    static List<Person> javaProgrammers = PersonUtil.getJavaProgrammers();
    static List<Person> phpProgrammers = PersonUtil.getPHPProgrammers();
    
    public static void main(String[] args) {
        System.out.println("java Programmers: ");
        javaProgrammers.forEach(e -> System.out.print(e));
        System.out.println("\nphp Programmers: ");
        phpProgrammers.forEach(System.out::print);
        
        
    }
}
