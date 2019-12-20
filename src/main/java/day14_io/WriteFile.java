package day14_io;

import java.io.FileWriter;
import java.util.Date;

public class WriteFile {
    public static void main(String[] args) {
        
        try(FileWriter fw = new FileWriter("src/main/java/day14_io/myfiles/demo.txt", true);) { // true 會保留之前資料
            fw.write("Java " + new Date() + "\n");
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
