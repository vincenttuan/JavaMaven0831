package day02;

public class StringAndStringBuilder {
    public static void update(String str) {
        str = str + "8";
    }
    
    public static void update(StringBuilder sb) {
        sb.append("8");
    }
    
    public static void main(String[] args) {
        String s = "Hello";
        update(s);
        System.out.println(s);
        System.out.println("--------------");
        StringBuilder s2 = new StringBuilder("Hello");
        update(s2);
        System.out.println(s2);
    }
    
}
