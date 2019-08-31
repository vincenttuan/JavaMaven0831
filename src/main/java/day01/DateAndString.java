package day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateAndString {
    public static void main(String[] args) throws ParseException {
        Date today = new Date();
        System.out.println(today);
        
        // 字串轉日期
        String birth = "2015/5/20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date myBirthday = sdf.parse(birth);
        System.out.println(myBirthday);
        
        // 日期相減的做法 I
        System.out.println(today.getTime());
        System.out.println(myBirthday.getTime());
        long diff = today.getTime() - myBirthday.getTime();
        System.out.println(diff);
        System.out.println("日: " + (diff / (1000*60*60*24)));
        System.out.println("年: " + ((diff / (1000*60*60*24)) / 365.0));
        
        // 日期相減的做法 II
        System.out.println("日: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        System.out.println("年: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)/365.0);
        
        // 日期相減的做法 III
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int y1 = cal.get(Calendar.YEAR);
        cal.setTime(myBirthday);
        int y2 = cal.get(Calendar.YEAR);
        System.out.println("年: " + (y1 - y2));
    }
}
