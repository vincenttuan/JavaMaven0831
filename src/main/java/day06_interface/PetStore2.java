package day06_interface;

import java.util.stream.Stream;

public class PetStore2 {
    
    public static void main(String[] args) {
        Decoration d1 = new Glass("狗", 100, 20);
        Decoration d2 = new Glass("貓", 150, 15);
        showtime(d1);
        showtime(d2);
        // Java 8
        int sum = Stream.of(d1, d2).mapToInt(d -> d.getAmount() * d.getPrice())
                .peek(System.out::println)
                .sum();
        System.out.println(sum);
    }
    
    public static void showtime(Decoration d) {
        System.out.printf("%s的%s, 數量: %d, 單價: %d, 總成本: %,d\n", 
                d.getName(), d.getType(), d.getAmount(), d.getPrice(), d.getAmount()*d.getPrice());
    }
  
    
    
}
