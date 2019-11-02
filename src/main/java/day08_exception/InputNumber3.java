package day08_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber3 {
    public static void main(String[] args) {
        input();
    }
    
    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字(分母): ");
        try {
            int x = sc.nextInt();
            System.out.printf("10 / %d = %d\n", x, 10/x);
        } catch (Exception e) {
            System.out.println("你錯了, " + e);
            input();
        }
        
    }
    
}
