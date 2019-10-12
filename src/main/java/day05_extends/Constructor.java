package day05_extends;

class Father {
    public Father() {
        System.out.println("Father");
    }
    public Father(int x) {
        System.out.println("Father" + x);
    }
}

class Son extends Father {
    public Son() {
        super(8);
        System.out.println("Son");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
