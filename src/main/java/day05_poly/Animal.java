package day05_poly;

public class Animal {
    private String kind;
    private int legs;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    
    public void move() {
        System.out.println("移動");
    }
}
