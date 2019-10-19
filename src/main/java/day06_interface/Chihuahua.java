package day06_interface;

public class Chihuahua extends ADog {
    private String kind;

    public Chihuahua(String kind) {
        this.kind = kind;
    }
    
    @Override
    public String getKind() {
        return kind;
    }
    
    @Override
    public void setKind(String kind) {
        this.kind = kind;
    }
    
    @Override
    public void play() {
        System.out.println("玩毛線");
    }

}
