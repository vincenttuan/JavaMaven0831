package day05_poly;

public class Ostrich extends Bird {

    public Ostrich() {
        setKind("鴕鳥");
    }

    @Override
    public void move() {
        System.out.println("走");
    }
    
    public void spirit() {
        System.out.println("鴕鳥精神");
    }
    
}
