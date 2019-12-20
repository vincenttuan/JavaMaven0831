package day14_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class WriterLottoFile {

    public static void main(String[] args) throws Exception {
        File file = new File("src/main/java/day14_io/myfiles/lotto.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw);) {
            
            IntStream.rangeClosed(1, 100).forEach(i -> {
                try {
                    System.out.println("進度: " + i);
                    bw.write(getLotto().toString().replace("[", "").replace("]", "").replace(",", ""));
                    bw.newLine();
                    bw.flush();
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (Exception e) {
                }
            });

        } catch (Exception e) {
        }
    }

    public static Set<String> getLotto() {
        Set<String> lotto = new TreeSet<>();
        while (lotto.size() < 5) {
            int n = ThreadLocalRandom.current().nextInt(39) + 1;
            lotto.add(String.format("%02d", n));
        }
        return lotto;
    }
}
