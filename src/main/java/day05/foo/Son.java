package day05.foo;

import day05.bar.Father;

public class Son extends Father {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.a);
        System.out.println(son.b);
        
        Father son2 = new Son();
        System.out.println(son2.a);
        //System.out.println(son2.b);
    }
}
