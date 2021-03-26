package hashSet;

import java.util.HashSet;
/*hashSet:集合
特点：1.底层数据结构是哈希表
    2.对集合的迭代顺序不做保证，存储取出元素的顺序不保证一致
    3.没有带索引的方法所以不可以用for循环遍历
    4.set集合 所以不包含重复元素

练习：存储字符并且遍历*/


/*哈希表：数组+链表
1.开始时候先计算哈希值 然后对16取余存在长度为16的表中
2.如果位置一样，则比较哈希值，若值一样则比比较内容*/
public class hashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<>();
        hashset.add("one");
        hashset.add("two");
        hashset.add("three");
        hashset.add("three");   //set集合保证唯一性


        //增强for循环
        for (String  s : hashset){
            System.out.print(s+"---");
        }
    }
}
