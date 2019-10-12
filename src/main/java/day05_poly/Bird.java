package day05_poly;

public class Bird extends Animal {

    public Bird() {
        setKind("鳥");
        setLegs(2);
    }
    
    @Override
    public void move() {
        System.out.println("飛");
    }
    
}
