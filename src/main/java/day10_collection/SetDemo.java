package day10_collection;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(); // 無序
        set1.add(100);
        set1.add(80);
        set1.add(90);
        Set<Integer> set2 = new TreeSet<>(); // 自然排序
        set2.add(100);
        set2.add(80);
        set2.add(90);
        System.out.println(set1);
        System.out.println(set2);
        
        IntSummaryStatistics stat = set1.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(stat.getAverage());
    }
}
