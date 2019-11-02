package day08_equals;

public class Ball {
    private String color;
    private int price;

    public Ball(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        Ball b2 = (Ball)obj;
        if(color.equals(b2.color) && price == b2.price) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 7 * 11 + color.hashCode() + price;
    }
    
    
    
    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", price=" + price + '}';
    }
    
}
