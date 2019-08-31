package day01_3;

import java.util.Scanner;

public class ATM {
    // 帳戶
    private Account account;
    
    // 系統目錄
    public void menu() {
        System.out.println("------------------------------");
        System.out.println("1.存款-------------------------");
        System.out.println("2.提款-------------------------");
        System.out.println("3.查詢-------------------------");
        System.out.println("4.修改密碼----------------------");
        System.out.println("9.離開-------------------------");
        System.out.println("------------------------------");
        System.out.printf("請選擇功能(1-9): ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        switch (no) {
            case 1:
                //System.out.println("你選擇存款");
                save();
                break;
            case 2:
                //System.out.println("你選擇提款");
                withdraw();
                break;
            case 3:
                //System.out.println("你選擇查詢");
                System.out.printf("%s 的帳戶餘額 $%d\n", account.getName(), account.getBalance(1234));
                break;
            case 4:
                changePassword();
                break;    
            case 9:
                System.out.println("你選擇離開");
                System.exit(0);
                break;
        }
        System.out.println("請按下任意鍵繼續 ... ");
        new Scanner(System.in).nextLine();
        menu();
    }
    
    // 存款
    public void save() {
        System.out.printf("請輸入存款金額: ");
        Scanner sc = new Scanner(System.in);
        // 取得使用者輸入的存款金額
        int money = sc.nextInt();
        // 存入到帳戶
        account.setBalance(money, 0);
    }
    
    // 提款
    public void withdraw() {
        System.out.printf("請輸入提款金額: ");
        Scanner sc = new Scanner(System.in);
        // 取得使用者輸入的提款金額
        int money = sc.nextInt();
        // 轉成負值
        money = (money < 0) ? money : money * -1;
        // 輸入密碼
        System.out.printf("請輸入提款密碼: ");
        int password = sc.nextInt();
        // 從帳戶提出
        account.setBalance(money, password);
    }
    
    // 變更 password
    public void changePassword() {
        System.out.printf("請輸入原密碼: ");
        Scanner sc = new Scanner(System.in);
        // 得到使用者所輸入的密碼
        int old_password = sc.nextInt();
        // 判斷密碼
        if(old_password != account.getPassword()) {
            System.out.println("原密碼輸入不正確");
            return;
        }
        // 新密碼第一次
        System.out.printf("請輸入新密碼: ");
        int new_password_1 = sc.nextInt();
        // 新密碼第二次
        System.out.printf("請再輸入新密碼: ");
        int new_password_2 = sc.nextInt();
        // 二次的新密碼輸入是否相同
        if(new_password_1 != new_password_2) {
            System.out.println("二次的新密碼輸入不相同");
            return;
        }
        // 新密碼不可與原密碼相同
        if(new_password_2 == old_password) {
            System.out.println("新密碼不可與舊密碼相同");
            return;
        }
        account.setPassword(new_password_2);
        System.out.println("密碼修改完成 !");
        
    }
    
    // 程式進入點
    public static void main(String[] args) {
        ATM atm = new ATM();
        // 開戶
        atm.account = new Account();
        atm.account.setName("John");
        // 進行交易(呼叫 menu)
        atm.menu();
    }
    
}
