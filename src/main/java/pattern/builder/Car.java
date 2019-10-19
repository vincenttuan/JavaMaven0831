package pattern.builder;

public class Car {

    private int wheel;
    private int door;
    private int cc;
    private String color;

    public Car(int wheel, int door, int cc, String color) {
        this.wheel = wheel;
        this.door = door;
        this.cc = cc;
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "wheel=" + wheel + ", door=" + door + ", cc=" + cc + ", color=" + color + '}';
    }
    
    
}
