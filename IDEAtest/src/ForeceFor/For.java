package ForeceFor;


import java.util.ArrayList;
import java.util.List;

//增强for 循环：简化数组和collection集合的遍历
//格式： for（元素数据类型 变量名 ：数组或者collection 集合）
public class For {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("tow");
        list.add("three");
        list.add("four");
        for (int i : arr){
            System.out.println(i);
        }
        for (String i : list){
            System.out.println(i);
        }
    }
}
