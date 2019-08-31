package day01;

import java.text.ParseException;

public class PetStore {

    public static void main(String[] args) throws ParseException {
        Puppy p1 = new Puppy();
        p1.name = "拉不拉多";
        p1.birth = "2010/5/20";
        
        Puppy p2 = new Puppy();
        p2.name = "柴犬";
        p2.birth = "2015/3/8";

        System.out.println(p1.name);
        System.out.println(p1.birth);
        System.out.println(p1.getAge());
        
        System.out.println(p2.name);
        System.out.println(p2.birth);
        System.out.println(p2.getAge());

    }

}
