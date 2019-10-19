package day06_interface;

public abstract class Decoration {
    public String getType() {
        return "擺設飾品";
    }
    
    public abstract String getName();
    public abstract int getAmount();
    public abstract int getPrice();
}
