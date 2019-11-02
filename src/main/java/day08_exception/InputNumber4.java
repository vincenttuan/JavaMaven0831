package day08_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber4 {
    public static void main(String[] args) {
        try {
            input();
        } catch (Exception ex) {
            System.out.println("錯了, " + ex);
            main(null);
        }
    }
    
    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字(分母): ");
        int x = sc.nextInt();
        System.out.printf("10 / %d = %d\n", x, 10/x);
    }
    
}
