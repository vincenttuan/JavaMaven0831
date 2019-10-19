package day06_interface;

public class Chihuahua implements IDog {
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

    @Override
    public void eat() {
        System.out.println("狗罐頭");
    }
    
}
