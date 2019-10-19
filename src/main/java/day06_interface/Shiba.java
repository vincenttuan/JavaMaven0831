package day06_interface;

public class Shiba implements IDog {

    @Override
    public void play() {
        System.out.println("玩飛盤");
    }

    @Override
    public void eat() {
        System.out.println("狗罐頭");
    }
    
}
