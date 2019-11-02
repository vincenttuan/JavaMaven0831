package day08_enum;

public enum USCurrency {
    PENNY(1), // 1美分
    NICKLE(5), // 5美分
    DIME(10), // 10美分
    QUARTER(25), // 25美分
    Zero(0); // 0美分
    
    private int value;
    
    private USCurrency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
}