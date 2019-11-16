package day10_collection2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
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
        
        
    }
}
