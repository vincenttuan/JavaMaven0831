package day04_constructor;

public class ExamMain {
    public static void main(String[] args) {
        Exam e1 = new Exam();
        e1.setSno(1);
        e1.setChineseScore(100);
        e1.setMathScore(90);
        e1.setEnglishScore(80);
        
        Exam e2 = new Exam(2, 80, 70, 60);
        
        System.out.println(e1);
        System.out.println(e2);
    }
}
