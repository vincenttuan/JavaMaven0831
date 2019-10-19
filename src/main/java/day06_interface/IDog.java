package day06_interface;

public interface IDog {
    // 屬性
    int legs = 4; // public static final int legs = 4;
    // 方法(要覆寫實作)
    void play(); // public abstract void play();
    void eat(); // public abstract void eat();
    String getKind();
    void setKind(String kind);
    // Java 8 (預設實作)
    default void copyright() {
        System.out.println("巨匠電腦");
    }
}
