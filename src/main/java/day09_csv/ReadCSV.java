package day09_csv;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ReadCSV {
    public static void main(String[] args) {
        // 1. 讀取 csv 資料
        String csvData = readCSVData("src/main/java/day09_csv/users.csv");
        System.out.println(csvData);
        System.out.println("---------------------------------------------------");
        // 2. 切分 csv 資料
        String[] csvRows = csvData.split("\r\n");
        IntStream.range(1, csvRows.length)
                .forEach(i -> System.out.println(csvRows[i]));
        System.out.println("---------------------------------------------------");
        // 3. 放入集合
        Set<User> users = new HashSet<>();
        IntStream.range(1, csvRows.length)
                .forEach(i -> {
                    String[] row = csvRows[i].split(",");
                    String name = row[0];
                    String email = row[1];
                    String phone = row[2];
                    String country = row[3];
                    User user = new User(name, email, phone, country);
                    users.add(user);
                });
        System.out.printf("集合筆數: %d\n集合內容: %s\n", users.size(), users);
        System.out.println("---------------------------------------------------");
        // 4.分析資料
        Predicate<User> filterCountry = u -> u.getCountry().equals("United States");
        Predicate<User> filterName = u -> u.getName().contains("Obama");
        Predicate<User> filterTel = u -> u.getPhone().endsWith("9");
        users.stream()
                .filter(filterCountry)
                .forEach(System.out::println);
        
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
