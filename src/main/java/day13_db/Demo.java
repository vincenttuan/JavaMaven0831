package day13_db;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws Exception {
        CRUD crud = new CRUD();
        System.out.println(crud.query());
        TimeUnit.SECONDS.sleep(2);
        crud.create("2317.TW", 50, 2000);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(crud.query());
        crud.updateAmount(2, 6000);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(crud.query());
        TimeUnit.SECONDS.sleep(2);
        crud.delete(1);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(crud.query());
    }
}
