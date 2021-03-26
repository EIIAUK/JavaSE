package Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {

        Date d = new Date();
        System.out.println( d.getTime()/1000/60/60/24/365);
        System.out.println("当前时间"+d);


        SimpleDateFormat sdf = new SimpleDateFormat();
        String s =sdf.format(d);
        System.out.println(s);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String s1 =sd.format(d);
        System.out.println(s1);

        //日期解析
        String ss = "2020年03月11日22:00:00";
        Date dd = sd.parse(ss);
        System.out.println(dd);

    }
}
