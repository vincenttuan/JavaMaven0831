package day07_innerclass;

public class PetStore {
    public static void main(String[] args) {
        // Java 7
        IPuppy puppy = new IPuppy() {
            public void skill() {
                System.out.println("拿報紙");
            }
        };
        puppy.skill();
        
        // Java 8
        IPuppy puppy2 = () -> System.out.println("叼拖鞋");
        puppy2.skill();
    }
    
}
