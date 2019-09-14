package day03_array;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        // 0~10
        int[] scores = new int[10];
        // 新增資料
        for(int i=0;i<scores.length;i++) {
            int score = new Random().nextInt(11);
            scores[i] = score;
        }
        // 顯示資料 1 (for-loop)
        for(int i=0;i<scores.length;i++) {
            System.out.printf("%d ", scores[i]);
        }
        System.out.println();
        
        // 顯示資料 2 (for-in, for-each)
        for(int score : scores) {
            System.out.printf("%d ", score);
        }
        System.out.println();
        
    }
}
