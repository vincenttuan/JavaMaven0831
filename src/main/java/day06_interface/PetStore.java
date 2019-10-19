package day06_interface;

import java.util.stream.Stream;

public class PetStore {
    
    public static void main(String[] args) {
        // Java 7
        Shiba shiba = new Shiba("柴犬");
        Chihuahua chihuahua = new Chihuahua("吉娃娃");
        showtime(shiba);
        showtime(chihuahua);
        System.out.println("---------------------------");
        // Java 8
        //Stream.of(shiba, chihuahua).forEach(dog -> showtime(dog));
        Stream.of(shiba, chihuahua).forEach(PetStore::showtime);
    }
    
    public static void showtime(IDog dog) {
        System.out.printf("%s 有 %d 條腿\n", dog.getKind(), IDog.legs);
        dog.eat();
        dog.play();
    }
    
    
}
