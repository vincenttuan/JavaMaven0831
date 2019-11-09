package day09_exception.login;

import java.util.Arrays;

public class User {
    private String[] users = {"John", "Mary", "Jo"};
    
    public boolean login(String userName) throws LoginException {
        boolean check = Arrays.asList(users)
                .stream()
                .anyMatch(name -> name.equals(userName));
        
        if(check) {
            return true;
        } else {
            LoginException e = new LoginException("登入失敗");
            throw e;
        }
    }
}
