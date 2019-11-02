package day08_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber {
    public static void main(String[] args) {
        input();
    }
    
    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字: ");
        try {
            int x = sc.nextInt();
            System.out.printf("%d 的平方 = %.1f\n", x, Math.pow(x, 2));
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤, 請重新輸入~");
            input();
        }
        
    }
    
}
