package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// list集合 特点
//1. 有序 2.可重复
public class ListDemo {
    public static void main(String[] args) {
//        创建集合对象
        List<String> list = new ArrayList<>();
        //添加元素
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("two");  //可重复
//        System.out.println(list);

        //迭代器遍历
     /*   Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }*/
      //  添加 add 返回true/false
        list.add(1,"1");
        //修改 set  修改指针处的元素并且返回元素
        list.set(1,"2");
        //删除指针处的元素并且返回元素
        list.remove(2);
       /* String a  = list.get(1);
        System.out.println(a);*/
        //返回指针所指的元素
        list.get(1);

        //迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //循环遍历
        for(int i = 0 ; i < list.size();i++)
        {
            System.out.print(list.get(i)+ " ");
        }
    }
}
