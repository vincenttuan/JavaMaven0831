package day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Puppy {
    String name; // 狗名
    String birth; // 生日
    
    int getAge() throws ParseException { // 取得年齡
        Date today = new Date();
        Date birthdate = new SimpleDateFormat("yyyy/MM/dd").parse(birth);
        long diff = today.getTime() - birthdate.getTime();
        long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        int age = (int)(days / 365);
        return age;
    }
    
}
