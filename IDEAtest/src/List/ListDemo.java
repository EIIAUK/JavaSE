package List;

/*List集合常用子类：Arrylist，linkedList
    ArryList：底层数据结构是数组，查询快，增删慢
    LinkedList：底层数据结构是链表，查询慢，增删快*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//    联系：分别使用两种list完成存储字符串并且遍历
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");

        Iterator arr = arrayList.listIterator();
        while (arr.hasNext()){
            String s = (String) arr.next();
            System.out.print(s + "");

        }
     /*   for (int i=0; i<arrayList.size();i++)
        {
            System.out.print(arrayList.get(i));
        }*/
        System.out.println();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("一");
        linkedList.add("二");
        linkedList.add("三");
        linkedList.add("四");
        Iterator lk = linkedList.listIterator();
        while (lk.hasNext()){
            String s = (String) lk.next();
            System.out.print(s+"");
        }

        //增强for
        System.out.println();
        System.out.println("增强for");
        for(String lkfor : linkedList)
        {
            System.out.print(lkfor);
        }

    }

}
