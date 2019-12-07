package day13_lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LottoMain {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Lotto());
        service.execute(new Lotto());
        service.execute(new Lotto());
        service.shutdown();
    }
}
