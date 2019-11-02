package day08_enum;

public class Coin {
    public static void main(String[] args) {
        USCurrency us = USCurrency.QUARTER;
        System.out.println(us.getValue());
    }
}
