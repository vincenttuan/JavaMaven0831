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
        Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
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
    
    public void create(String symbol, double cost, int amount) throws Exception {
        String sql = "SELECT id, symbol, cost, amount FROM APP.PORTFOLIO";
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(sql);
        if(conn.isClosed()) {
            return;
        }
        rs.moveToInsertRow();
        rs.updateString("symbol", symbol);
        rs.updateDouble("cost", cost);
        rs.updateInt("amount", amount);
        rs.insertRow();
        System.out.println("新增成功");
    }
    
    public void updateAmount(int id, int amount) throws Exception {
        String sql = "SELECT id, amount FROM APP.PORTFOLIO Where id=" + id;
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(sql);
        if(conn.isClosed()) {
            return;
        }
        
        if(rs.last()) {
            rs.updateInt("amount", amount);
            rs.updateRow();
            System.out.println("修改成功");
        } else {
            System.out.println("找不到資料修改");
        }
        
    }
    
    public void delete(int id) throws Exception {
        String sql = "SELECT * FROM APP.PORTFOLIO Where id=" + id;
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(sql);
        if(conn.isClosed()) {
            return;
        }
        
        if(rs.last()) {
            rs.deleteRow();
            System.out.println("刪除成功");
        } else {
            System.out.println("找不到資料刪除");
        }
        
    }
}
