package day10_collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import javax.print.attribute.HashAttributeSet;

public class SetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("John", 18);
        Student s2 = new Student("Mary", 19);
        Student s3 = new Student("Bob", 17);
        Student s4 = new Student("Bob", 17);
        
        Set<Student> set1 = new HashSet<>();
        set1.add(s1);set1.add(s2);set1.add(s3);set1.add(s4);
        System.out.println(set1);
        
        Set<Student> set2 = new TreeSet<>();
        set2.add(s1);set2.add(s2);set2.add(s3);set2.add(s4);
        System.out.println(set2);
        
        
    }
}
