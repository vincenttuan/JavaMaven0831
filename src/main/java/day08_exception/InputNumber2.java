package day08_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber2 {
    public static void main(String[] args) {
        input();
    }
    
    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字(分母): ");
        try {
            int x = sc.nextInt();
            System.out.printf("10 / %d = %d\n", x, 10/x);
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤, 請重新輸入~");
            input();
        } catch (ArithmeticException e) {
            System.out.println("數學計算上的錯誤: " + e.getMessage());
            System.out.println("請重新輸入~");
            input();
        }
        
    }
    
}
