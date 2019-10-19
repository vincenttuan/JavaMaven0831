package day06_interface;

public class Shiba extends ADog {
    private String kind;

    public Shiba(String kind) {
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
        System.out.println("玩飛盤");
    }

    @Override
    public void eat() {
        System.out.println("西莎");
    }
    
    
}
