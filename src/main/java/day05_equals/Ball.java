package day05_equals;

public class Ball {
    private String color;
    private int price;

    public Ball(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        
        if (!(obj instanceof Ball)) {
            return false;
        }
        
        Ball b = (Ball)obj;
        if(color.equals(b.color) && price == b.price) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 7 * 11 + color.hashCode() + price;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", price=" + price + '}';
    }
    
}
