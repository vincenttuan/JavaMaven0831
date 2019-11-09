package day09_exception.login;

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        input();
    }
    
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入使用者名稱: ");
        String userName = scanner.nextLine();
        
        loginCheck(userName);
        
    }
    
    public static void loginCheck(String username) {
        User user = new User();
        
        try {
            boolean check = user.login(username);
        } catch (LoginException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.how2Do();
            e.printStackTrace(System.out);
            System.out.println("請重新登入");
            input();
        }
    }
}
