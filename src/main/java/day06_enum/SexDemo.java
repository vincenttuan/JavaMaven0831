package day06_enum;

public class SexDemo {
    public static void main(String[] args) {
        side(Sex.男生);
        side(Sex.valueOf("女生"));
    }
    public static void side(Sex sex) {
        switch(sex) {
            case 男生:
                System.out.println("走左邊");
                break;
            case 女生:
                System.out.println("走右邊");
                break;    
        }
    }
}
