package day05_equals;

public class EqualsDemo {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Ball b1 = new Ball("白", 100);
        Ball b2 = new Ball("白", 100); // b1
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
