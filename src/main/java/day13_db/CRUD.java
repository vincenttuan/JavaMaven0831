package day13_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CRUD {
    static Connection conn;
    static {
        String driverClass = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/demo";
        String username = "app";
        String password = "app";
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
        }
    }
    
    public List<Map> query() throws Exception {
        String sql = "SELECT id, symbol, cost, amount FROM APP.PORTFOLIO";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        List<Map> list = new ArrayList<>();
        while(rs.next()) {
            Map map = new LinkedHashMap();
            map.put("id", rs.getInt("id"));
            map.put("symbol", rs.getString("symbol"));
            map.put("cost", rs.getDouble("cost"));
            map.put("amount", rs.getInt("amount"));
            list.add(map);
        }
        return list;
    }
    
}
