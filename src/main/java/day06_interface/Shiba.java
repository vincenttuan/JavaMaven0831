package day06_interface;

public class Shiba implements IDog {
    private String kind;

    public Shiba(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }
    
    @Override
    public void play() {
        System.out.println("玩飛盤");
    }

    @Override
    public void eat() {
        System.out.println("狗罐頭");
    }
    
}
