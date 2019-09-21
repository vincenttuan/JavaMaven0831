package day04_oo;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ExamMain3 {
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
        
        // 列表資料
        Arrays.stream(exams).forEach(e -> System.out.println(e));
        Arrays.stream(exams).forEach(System.out::println);
        
        
    }
}
