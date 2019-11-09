package day09_csv;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadCSV {
    public static void main(String[] args) {
        String csvData = readCSVData("src/main/java/day09_csv/users.csv");
        System.out.println(csvData);
        
    }
    
    // 讀取 csv 的資料
    public static String readCSVData(String path_string) {
        // csv 路徑
        Path path = Paths.get(path_string);
        // 放置 csv 內容
        StringBuilder csvData = new StringBuilder();
        // 讀取 csv 內容資料
        try(Reader reader = Files.newBufferedReader(path);) {
            // 每次抓到的一個字
            int data = 0;
            while((data = reader.read()) != -1) { // 輪詢處理 (-1表示讀到檔尾)
                //System.out.print((char)data);
                // 將每次抓到的一個字, 轉 char 並放入 csvData 來集中
                csvData.append((char)data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return csvData.toString();
        
    }
}
