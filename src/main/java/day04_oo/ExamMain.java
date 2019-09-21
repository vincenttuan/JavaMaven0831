package day04_oo;

public class ExamMain {
    public static void main(String[] args) {
        Exam e1 = new Exam();
        e1.setSno(1);
        e1.setChineseScore(100);
        e1.setMathScore(90);
        e1.setEnglishScore(80);
        
        Exam e2 = new Exam();
        e2.setSno(2);
        e2.setChineseScore(80);
        e2.setMathScore(85);
        e2.setEnglishScore(45);
        
        System.out.printf("學號: %d, 國文: %d, 數學: %d, 英文: %d\n", 
                e1.getSno(), e1.getChineseScore(), e1.getMathScore(), e1.getEnglishScore());
        
        System.out.printf("學號: %d, 國文: %d, 數學: %d, 英文: %d\n", 
                e2.getSno(), e2.getChineseScore(), e2.getMathScore(), e2.getEnglishScore());
    }
}
