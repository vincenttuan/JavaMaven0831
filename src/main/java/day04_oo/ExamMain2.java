package day04_oo;

import java.util.Random;

public class ExamMain2 {
    public static void main(String[] args) {
        Exam[] exams = new Exam[10];
        for(int i=0;i<exams.length;i++) {
            // 建立物件
            Exam e = new Exam();
            // 使用封裝
            e.setSno(i+1);
            e.setChineseScore(new Random().nextInt(101));
            e.setMathScore(new Random().nextInt(101));
            e.setEnglishScore(new Random().nextInt(101));
            // 加入到陣列
            exams[i] = e;
        }
        
        // 列表資料 1
        for(Exam e : exams) {
            System.out.printf("學號: %d, 國文: %d, 數學: %d, 英文: %d\n", 
                    e.getSno(), e.getChineseScore(), e.getMathScore(), e.getEnglishScore());
        }
        
        // 列表資料 2
        for(Exam e : exams) {
            System.out.println(e);
        }
        
        
    }
}
