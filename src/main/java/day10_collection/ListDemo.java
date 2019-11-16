package day10_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
        
    }
}
