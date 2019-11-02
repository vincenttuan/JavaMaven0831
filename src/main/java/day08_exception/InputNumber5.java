package day08_exception;

import java.util.Scanner;

public class InputNumber5 {
    public static void main(String[] args) throws Exception {
        input();
    }
    
    public static void input() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字(分母): ");
        int x = sc.nextInt();
        System.out.printf("10 / %d = %d\n", x, 10/x);
    }
    
}
