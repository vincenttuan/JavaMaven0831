package day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndString {
    public static void main(String[] args) throws ParseException {
        Date today = new Date();
        System.out.println(today);
        
        // 字串轉日期
        String birth = "2015/5/20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date myBirthday = sdf.parse(birth);
        System.out.println(myBirthday);
        
    }
}
