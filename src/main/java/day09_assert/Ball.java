package day09_assert;

import java.util.Objects;

public class Ball {
    private String color;
    private int price;

    public Ball(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ball other = (Ball) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", price=" + price + '}';
    }
    
}
