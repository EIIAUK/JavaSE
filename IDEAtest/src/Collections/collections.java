package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(6);


        //conllections 是一个具体的类正对集合操作的工具类 排序
        Collections.sort(list);   //collections.sort() 升序排序
        System.out.println(list);
        Collections.reverse(list);  //revers逆序排序
        System.out.println(list);
        Collections.shuffle(list); //随即置换
        System.out.println(list);
    }
}
