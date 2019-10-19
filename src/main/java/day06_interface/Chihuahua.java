package day06_interface;

public class Chihuahua implements IDog {

    @Override
    public void play() {
        System.out.println("玩毛線");
    }

    @Override
    public void eat() {
        System.out.println("狗罐頭");
    }
    
}
