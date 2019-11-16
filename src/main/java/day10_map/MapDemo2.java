package day10_map;

import java.util.Arrays;
import static java.util.Comparator.comparingInt;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo2 {
    public static void main(String[] args) {
        List<Student> stds = Arrays.asList(
                // name, course, city, age
                new Student("Jessy", "Java ME", "Chicage", 18),
                new Student("Helen", "Java EE", "Houston", 20),
                new Student("John",  "Java EE", "Houston", 22),
                new Student("Mark",  "Java ME", "Chicage", 19),
                new Student("Tom",   "Java EE", "Taipei", 25));
        
        // 分類(分群組)
        Map map4Course = stds.stream().collect(Collectors.groupingBy(Student::getCourse)); // s -> s.getCourse()
        System.out.println(map4Course);
        
        Map map4Course2 = stds.stream().collect(Collectors.groupingBy(Student::getCourse, Collectors.maxBy(comparingInt(Student::getAge))));
        System.out.println(map4Course2);
        
        Map map4City = stds.stream().collect(Collectors.groupingBy(Student::getCity)); 
        System.out.println(map4City);
        
        
        
    }
}
