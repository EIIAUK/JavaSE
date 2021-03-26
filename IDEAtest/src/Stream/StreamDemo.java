package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        ArrayList<String> s = new ArrayList<>();
    /*    s.add("张鳗鱼");
        s.add("张是");
        s.add("为棕榈");
        s.add("李鸿章");
        s.add("王八蛋");
        s.add("张三");*/
        s.add("1号人李1");
        s.add("2号人李2");
        s.add("3号人李3");
        s.add("4号人李4");
        s.add("5号人李5");
        s.add("6号人李6");
        s.add("7号人李7");
        s.add("8号人李8");




        //把list 中张开头的输出

      /*  s.stream().filter(a -> a.startsWith("张")).forEach(System.out::println);
        System.out.println();
        //把list 中 长度为3 输出

        s.stream().filter(a->a.length() ==3).forEach(System.out::println);
        System.out.println();
        //把list中 张开头 长为3 输出
        s.stream().filter(a->a.startsWith("张")).filter(a->a.length()==3).forEach(System.out::println);
        System.out.println();*/

       /* //取前前三个元素数据输出
        s.stream().limit(3).forEach(System.out::println);
        System.out.println();
        //跳过前三个元素数据输出
        s.stream().skip(3).forEach(System.out::println);
*/
        //取前四个数据组成一个流

        Stream<String> s1 = s.stream().limit(4);
        //跳过前两个数据组成一个流
        Stream<String> s2 = s.stream().skip(2);
        //合并需求1和需求2得到的流，输出再控制台
     /*  Stream.concat(s1,s2).forEach(System.out::println);
        System.out.println();
*/
        //合并1/2 输出控制台不能重复
        Stream.concat(s1,s2).distinct().forEach(System.out::println);
    }
}
