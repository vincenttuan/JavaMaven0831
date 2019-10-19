package day06_enum;

public class GradeDemo {
    public static void main(String[] args) {
        Grade grade = Grade.小學; // 不可加上 new
        System.out.println(grade.getValue());
    }
}
