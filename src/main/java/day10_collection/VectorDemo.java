package day10_collection;

import java.util.Vector;
import java.util.stream.IntStream;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(100, 10); // (100 -> 初始 capacity, 10 -> 不足增加的數量)
        IntStream.rangeClosed(1, 101).forEach(i -> v.add(i));
        System.out.printf("capacity: %d, size: %d\n", v.capacity(), v.size());
    }
}
