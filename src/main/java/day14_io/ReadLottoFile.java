package day14_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class ReadLottoFile {

    public static void main(String[] args) throws Exception {
        File file = new File("src/main/java/day14_io/myfiles/lotto.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);) {
            
            List list = br.lines().collect(toList());
            //System.out.println(list);
            String numbers = list.toString().replace("[", "").replace("]", "").replace(",", "");
            String[] numArray = numbers.split(" ");
            //Arrays.stream(numArray).forEach(System.out::println);
            Map<String, Long> map = Arrays.stream(numArray)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(map);
            
            long max = map.entrySet().stream().mapToLong(x -> x.getValue()).max().getAsLong();
            long min = map.entrySet().stream().mapToLong(x -> x.getValue()).min().getAsLong();
            System.out.printf("max: %d min: %d\n", max, min);
            map.entrySet().stream().filter(x -> x.getValue() == max).forEach(System.out::println);
            map.entrySet().stream().filter(x -> x.getValue() == min).forEach(System.out::println);
            
            
        } catch (Exception e) {
        }
    }

}
