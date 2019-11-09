package day09_exception.login;

public class LoginException extends Exception {

    public LoginException(String errorMessage) {
        super(errorMessage);
    }
    
    public void how2Do() {
        System.out.println("請與客服聯絡");
    }
}
