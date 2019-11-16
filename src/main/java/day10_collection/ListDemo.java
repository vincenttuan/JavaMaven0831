package day10_collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class ListDemo {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(5, 7, 1, 1, 4, 3, 8);
        // Java 7 走訪
        Iterator<Integer> it = list.iterator(); // list 走訪器
        while (it.hasNext()) { // 是否有元素
            System.out.print(it.next() + " "); // 取得元素
        }
        System.out.println();
        
        // Java 7 走訪 + 分析
        it = list.iterator(); // list 走訪器
        while (it.hasNext()) { // 是否有元素
            int x = it.next(); // 取得元素
            if(x % 2 == 0) { // 分析判斷
                System.out.print(x + " "); 
            }
        }
        System.out.println();
        
        // Java 8 走訪
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();
        
        // Java 8 走訪 + 分析1
        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + " "));
        
        System.out.println();
        
        // Java 8 走訪 + 分析2
        long count = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println("count: " + count);
        
        // Java 8 走訪 + 分析3
        long count2 = list.stream()
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.print("觀察:" + x + " ")) //觀察集合內容
                .count();
        System.out.println("\ncount2: " + count2);
        
        // Java 8 走訪 + 分析 + 置入新集合
        List<Integer> newList = list.stream().filter(x -> x % 2 == 0).collect(toList());
        System.out.println(newList);
        
        // Java 8 走訪 + 排序
        list.stream().sorted(Comparator.naturalOrder()).forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.stream().sorted(Comparator.comparing(x -> x%2)).forEach(x -> System.out.print(x + " "));
        System.out.println();
        
        // Java 8 統計
        // mapToInt(x -> x) 將 Stream (Integer) 轉成 IntStream (int)
        // x -> x.intValue() 因為 unboxing 可省略寫成 x -> x
        IntSummaryStatistics stat = list.stream().mapToInt(x -> x.intValue()).summaryStatistics();
        System.out.println(stat);
        
        // Java 8 轉換 將每一個元素 x 10 倍
        // mapToInt 會得到 IntStream
        list.stream().mapToInt(x -> x * 10).forEach(x -> System.out.print(x + " "));
        System.out.println();
        
        
    }
}
