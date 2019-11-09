package csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
// OpenCSV
// https://www.callicoder.com/java-read-write-csv-file-opencsv/
public class Test {
    private static final String PATH = "src/main/java/csv/users.csv";
    public static void main(String[] args) throws Exception {
        Reader reader = Files.newBufferedReader(Paths.get(PATH));
        CsvToBean<User> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(User.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        List<User> users = csvToBean.parse();
        System.out.println(users);
    }
}
