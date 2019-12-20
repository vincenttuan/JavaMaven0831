package day14_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class CopyWebImage {
    public static void main(String[] args) throws Exception {
        String o_path = "https://image.u-car.com.tw/articleimage_915580.jpg";
        String s_path = "src/main/java/day14_io/myfiles/car.jpg";
        try(InputStream is = new URL(o_path).openStream();
            FileOutputStream fos = new FileOutputStream(s_path);) {
            System.out.println("檔案大小: " + is.available() + " bytes");
            
            byte[] buffer = new byte[1];
            while (is.read(buffer) != -1) {
                fos.write(buffer);
            }
            
        } catch (Exception e) {
        }
        System.out.println("Copy ok!");
    }
}
