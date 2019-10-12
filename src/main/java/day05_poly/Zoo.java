package day05_poly;

import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Lion lion = new Lion();
        Ostrich ostrich = new Ostrich();
        printAnimal(bird);
        printAnimal(lion);
        printAnimal(ostrich);
        
        Animal animal = getAnimal();
        printAnimal(animal);
        // 轉型
        if(animal instanceof Ostrich) {
            ((Ostrich)animal).spirit();
        }
    }
    public static void printAnimal(Animal animal) {
        System.out.printf("%s有 %s 條腿 ", animal.getKind(), animal.getLegs());
        animal.move();
    }
    
    public static Animal getAnimal() {
        int x = new Random().nextInt(3); // 0, 1, 2
        Animal animal = null;
        switch(x) {
            case 0:
                animal = new Bird();
                break;
            case 1:
                animal = new Ostrich();
                break;
            default:
                animal = new Lion();
                break;    
        }
        return animal;
    }
    
}
