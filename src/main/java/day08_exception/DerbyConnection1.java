package day08_exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyConnection1 {
    public static void main(String[] args) {
        String driverClass = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/MyDB";
        String username = "app";
        String password = "app";
        
        Connection conn = null;
        try {
            // 載入Derby資料庫Client物件 for JDBC 3.0, JDBC 4.0 不用寫
            Class.forName(driverClass);
            // 建立連線
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("連線是否關閉 ? " + conn.isClosed());
        } catch(Exception e) {
            System.out.println("錯誤1, " + e);
        } finally {
            if(conn != null) {
                try {
                    // 關閉連線
                    conn.close();
                } catch(SQLException e) {
                    System.out.println("錯誤2, " + e);
                }
            }
        }
        
        try {
            System.out.println("連線是否關閉 ? " + conn.isClosed());
        } catch(Exception e) {
            System.out.println("錯誤3, " + e);
        }
        
    }
}
