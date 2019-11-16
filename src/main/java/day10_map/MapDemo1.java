package day10_map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo1 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "小明");
        map.put(102, "小華");
        System.out.println(map.get(101));
        System.out.println(map.get(102));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        // Java 7 走訪
        for(Map.Entry<Integer, String> value : map.entrySet()) {
            System.out.println(value.getKey() + ":" + value.getValue());
        }
        // Java 8 走訪
        map.entrySet().forEach(System.out::println);
        
        // Map -> Stream -> MAP
        Map<Integer, String> map2 = map.entrySet().stream().collect(Collectors.toMap(x -> x.getKey()%100, x -> x.getValue()));
        System.out.println(map2);
        
        // Map -> Stream -> String
        String names = map.entrySet()
                .stream()
                .map(x -> x.getValue())
                .collect(Collectors.joining(","));
        System.out.println(names);
    }
}
