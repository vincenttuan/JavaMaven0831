package day14_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImage {
    public static void main(String[] args) throws Exception {
        String o_path = "C:/Users/study/Pictures/starlux.jpg";
        String s_path = "src/main/java/day14_io/myfiles/starlux.jpg";
        try(FileInputStream fis = new FileInputStream(o_path);
            FileOutputStream fos = new FileOutputStream(s_path);) {
            System.out.println("檔案大小: " + fis.available() + " bytes");
            
            byte[] buffer = new byte[1];
            while (fis.read(buffer) != -1) {
                fos.write(buffer);
            }
            
        } catch (Exception e) {
        }
        System.out.println("Copy ok!");
    }
}
