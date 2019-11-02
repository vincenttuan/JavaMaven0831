package day08_exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyConnection2 {
    public static void main(String[] args) {
        String driverClass = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/MyDB";
        String username = "app";
        String password = "app";
        
        // try()-with-resource
        // 建立連線
        try(Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("連線是否關閉 ? " + conn.isClosed());
        } catch(Exception e) {
            System.out.println("錯誤1, " + e);
        }
        
    }
}
