package List;

/*public  void addFirst(E e) 在开头插入指定元素
public void addLast(E e) 在末尾插入指定元素
public E getFirst()  返回第一个元素
public E getLast()     返回最后一个元素
public  E removeFirst() 从列表中删除第一个元素
public E removeLast() 从列表中删除最后一个元素*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        for (String s : list){
            System.out.print(s +"-");

        }
        System.out.println();
        list.addFirst("第一个元素");
        list.addLast("最后一个元素");
        for (String s : list){
            System.out.print(s +" ");
        }
        list.removeFirst();
        System.out.println("");
        System.out.println("移除第一个元素");
        for (String s : list){
            System.out.print(s +" ");
        }
        list.removeLast();
        System.out.println("");
        System.out.println("移除最后一个元素");
        for (String s : list){
            System.out.print(s +" ");
        }
        list.remove(2);
        System.out.println("");
        System.out.println("移除index=2de 元素");
        for (String s : list){
            System.out.print(s +" ");
        }
        System.out.println("");
        System.out.println("清空表");
        list.removeAll(list);
        System.out.println("表长："+list.size());
        /*for (String s : list){
            System.out.print(s +" "+"表长：" +list.size());
        }
*/

    }
}
