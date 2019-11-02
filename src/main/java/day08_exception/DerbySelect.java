package day08_exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DerbySelect {
    public static void main(String[] args) {
        String driverClass = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/MyDB";
        String username = "app";
        String password = "app";
        
        // SQL 語法
        String sql = "SELECT product_id, purchase_cost, quantity_on_hand, description FROM APP.PRODUCT";
        // try()-with-resource
        // 建立連線
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            
            // 欄位標題
            ResultSetMetaData md = rs.getMetaData();
            for(int i=1;i<=md.getColumnCount();i++) {
                System.out.print(md.getColumnName(i) + "\t");
            }
            System.out.println("\n----------------------------------------------");
            // 列表資料
            while(rs.next()) {
                int product_id = rs.getInt("product_id");
                double purchase_cost = rs.getDouble("purchase_cost");
                int quantity_on_hand = rs.getInt("quantity_on_hand");
                String description = rs.getString("description");
                System.out.printf("%d\t%.2f\t%d\t%s\n", product_id, purchase_cost, quantity_on_hand, description);
            }
            
        } catch(Exception e) {
            System.out.println("錯誤1, " + e);
        }
        
    }
}
