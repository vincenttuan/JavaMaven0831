package day10_collection2;

import day10_map.Student;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class PersonMainGroup {
    static List<Person> javaProgrammers = PersonUtil.getJavaProgrammers();
    static List<Person> phpProgrammers = PersonUtil.getPHPProgrammers();
    
    public static void main(String[] args) {
        // 二維陣列
        List<List<Person>> list = Arrays.asList(javaProgrammers, phpProgrammers);
        System.out.println(list);
        
        // flatMap to 一維陣列
        List<Person> newList = list.stream().flatMap(x -> x.stream()).collect(toList());
        System.out.println(newList);
        
        // 分男女二組
        Map<String, List<Person>> map = newList.stream().collect(Collectors.groupingBy(Person::getGender)); 
        System.out.println(map);
        
        System.out.println("male: " + map.get("male").stream().mapToInt(x -> x.getSalary()).summaryStatistics());
        System.out.println("female: " + map.get("female").stream().mapToInt(x -> x.getSalary()).summaryStatistics());
    }
}
