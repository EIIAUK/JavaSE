package 常用接口函数;


/*String[] starArray = {"lqx,30","zmy,35","wzx,33"};
字符串数组中有多条信息，请按照格式“姓名:xx,年龄：xx”的格式将信息打印出来
要求：
    把打印姓名的动作作为第一个Consumer接口的lambda实例
        把打印年龄的动作作为第二个Consumer接口的lambda实例
    将两个Consumer接口按照顺序组合到一起使用*/

import java.util.function.Consumer;

public class ComsumerTest {
    public static void main(String[] args) {
        String[] strArray = {"lqx,30","zmy,35","wzx,33"};
        cut(strArray,(String str) ->{
          String name =   str.split(",")[0];
            System.out.print("姓名："+name);
            System.out.print(",");

        },(String str2) ->{
          int age =  Integer.parseInt(str2.split(",")[1]);
            System.out.println("年龄是："+age );
        });

        cut(strArray,(String str)->{
            System.out.print("姓名："+str.split(",")[0]);
        },(String str)->{
            System.out.println(",年龄："+ str.split(",")[1]);
        });

    }



    private  static  void cut(String[] strArrys,Consumer<String> con1,Consumer<String> con2){
        for(String str:strArrys){
            con1.andThen(con2).accept(str);
        }

    }
}
