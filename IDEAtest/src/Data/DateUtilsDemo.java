package Data;


import java.text.ParseException;
import java.util.Date;

public class DateUtilsDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String format = "yyyy-MM-dd HH:mm";


       String s1 =  DateUtils.dateToString(date, format);
        System.out.println(s1);
        Date d = DateUtils.StringToDate("2020-12-23 22:02",format);
        System.out.println(d);
    }
}
