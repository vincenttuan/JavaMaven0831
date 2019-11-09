package day09_exception;

import java.util.Scanner;

public class MathDIV {
    public static void main(String[] args) {
        input();
    }
    
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入分子: ");
        int x = scanner.nextInt();
        System.out.println("請輸入分母: ");
        int y = scanner.nextInt();
        
        try {
            int result = div(x, y);
            print(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("請重新輸入");
            input();
        }
        
    }
    
    public static int div(int x, int y) throws Exception {
        if(y == 0) {
            Exception e = new Exception("分母不可 = 0");
            throw e;
        }
        int result = x / y;
        return result;
    }
    
    public static void print(int result) {
        System.out.println("計算結果: " + result);
    }
    
}
