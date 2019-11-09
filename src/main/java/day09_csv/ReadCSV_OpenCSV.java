package day09_csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadCSV_OpenCSV {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/day09_csv/users.csv");
        Reader reader = Files.newBufferedReader(path);
        CsvToBean<User> csvToBean = new CsvToBeanBuilder(reader)
                .withType(User.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();
        // 分析
        csvToBean.parse().stream()
                .filter(u -> u.getCountry().equals("India"))
                .forEach(System.out::println);
    }
}
