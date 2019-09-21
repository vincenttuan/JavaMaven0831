package day04_oo;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ExamMain4 {
    public static void main(String[] args) {
        Exam[] exams = new Exam[10];
        // Java 8
        IntStream.range(0, exams.length).forEach(i -> {
            // 建立物件
            Exam e = new Exam();
            // 使用封裝
            e.setSno(i+1);
            e.setChineseScore(new Random().nextInt(101));
            e.setMathScore(new Random().nextInt(101));
            e.setEnglishScore(new Random().nextInt(101));
            // 加入到陣列
            exams[i] = e;
        }); 
        
        // 列表資料 Java 7
        for(Exam e : exams) {
            int sum = e.getChineseScore() + e.getEnglishScore() + e.getMathScore();
            if(sum >= 180) {
                System.out.println(sum);
            }
        }
        System.out.println("-----");
        // 列表資料 Java 8
        Arrays.stream(exams)
                .mapToInt(e -> e.getChineseScore() + e.getEnglishScore() + e.getMathScore())
                .filter(sum -> sum >= 180)
                .forEach(System.out::println);
        
        
        
    }
}
