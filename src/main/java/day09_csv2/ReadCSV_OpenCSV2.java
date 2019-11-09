package day09_csv2;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class ReadCSV_OpenCSV2 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/day09_csv2/10000 Sales Records.csv");
        Reader reader = Files.newBufferedReader(path);
        CsvToBean<Sales> salesList = new CsvToBeanBuilder(reader)
                .withType(Sales.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();
        // 分析
        Sales maxSales = salesList.parse().stream()
                    .max(Comparator.comparing(s -> s.getTotalProfit()))
                    .get();
        System.out.println(maxSales);
    }
}
