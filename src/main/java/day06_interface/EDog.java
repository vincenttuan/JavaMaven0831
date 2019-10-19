package day06_interface;

public class EDog implements Machine, IDog {
    private String kind;

    public EDog(String kind) {
        this.kind = kind;
    }
    
    @Override
    public int getVolt() {
        return 5;
    }

    @Override
    public void play() {
        System.out.println("Game");
    }

    @Override
    public void eat() {
        System.out.println("吃電");
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public void setKind(String kind) {
        this.kind = kind;
    }
    
}
