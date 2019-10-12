package day05_poly;

public class Lion extends Animal {

    public Lion() {
        setKind("獅子");
        setLegs(4);
    }

    @Override
    public void move() {
        System.out.println("跑");
    }
    
}
