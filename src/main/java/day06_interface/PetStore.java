package day06_interface;

public class PetStore {
    
    public static void main(String[] args) {
        Shiba shiba = new Shiba("柴犬");
        Chihuahua chihuahua = new Chihuahua("吉娃娃");
        showtime(shiba);
        showtime(chihuahua);
    }
    
    public static void showtime(IDog dog) {
        System.out.printf("%s 有 %d 條腿\n", dog.getKind(), IDog.legs);
        dog.eat();
        dog.play();
    }
    
    
}
