package day09_exception;

import java.util.Scanner;

public class CallStack {
    public static void main(String[] args) {
        input();
    }
    
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入資料: ");
        String data = scanner.nextLine();
        print(data);
    }
    
    public static void print(String data) {
        System.out.println("您的資料是資料:" + data);
        add(data);
    }
    
    public static void add(String data) {
        int x = 0;
        try {
            x = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("資料 " + data + " 無法轉成數字");
        }
        int x2 = x + x;
        System.out.println("資料相加的結果是: " + x2);
    }
    
}
