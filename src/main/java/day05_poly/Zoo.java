package day05_poly;

public class Zoo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Lion lion = new Lion();
        Ostrich ostrich = new Ostrich();
        printAnimal(bird);
        printAnimal(lion);
        printAnimal(ostrich);
    }
    public static void printAnimal(Animal animal) {
        System.out.printf("%s有 %s 條腿 ", animal.getKind(), animal.getLegs());
        animal.move();
    }
    
}
