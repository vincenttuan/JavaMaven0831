package day06_enum;

public enum Grade {
    小學(6), 國中(3), 高中(3), 大學(4), 五專(5);
    
    private int value;
 
    private Grade(int value) { // 建構子 private 或不寫
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
}
