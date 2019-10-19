package day06_interface;

import java.util.stream.Stream;

public class PetStore {
    
    public static void main(String[] args) {
        // Java 7
        Shiba shiba = new Shiba("柴犬");
        Chihuahua chihuahua = new Chihuahua("吉娃娃");
        EDog eDog = new EDog("電子狗");
        showtime(shiba);
        showtime(chihuahua);
        showtime(eDog);
        
        System.out.println("---------------------------");
        // Java 8
        //Stream.of(shiba, chihuahua).forEach(dog -> showtime(dog));
        Stream.of(shiba, chihuahua, eDog).forEach(PetStore::showtime);
        int sum = Stream.of(shiba, chihuahua, eDog).mapToInt(dog -> IDog.legs).sum();
        System.out.println(sum);
        
    }
  
    public static void showtime(IDog dog) {
        System.out.printf("%s 有 %d 條腿\n", dog.getKind(), IDog.legs);
        dog.eat();
        dog.play();
        dog.copyright();
    }
    
    
}
