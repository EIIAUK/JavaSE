package TreeSet;

import java.util.TreeSet;
/*TreeSet 集合特点
    1.元素有序，这里的顺序不是存入顺序
    （1）无参构造方法  自然排序
    （2）带参数，指定排序器排序
    2.没有索引所以不能for循环遍历
    3.0由于是set 所以不能又重复元素*/
public class TreeSetDEMO {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
         ts.add(9);
         ts.add(3);
         ts.add(2);
         ts.add(3);
         for (int i :ts){
             System.out.println(i);
         }
    }
}
