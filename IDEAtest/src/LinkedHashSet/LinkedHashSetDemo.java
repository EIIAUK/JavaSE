package LinkedHashSet;


import java.util.LinkedHashSet;

/*lingkedHashSet集合的特点：
1.哈希表和链表实现set接口，具有可以预测的迭代次序
2.由链表保证元素有序，也就是说元素的存储和去除顺序是一致的
3.由哈希表保证元素的唯一，也就是说没有重复的元素*/
public class LinkedHashSetDemo<S> {
    public static void main(String[] args) {
   LinkedHashSet<String> set = new LinkedHashSet<>();
   set.add("one");
   set.add("two");
   set.add("three");
    for(String s :set){
        System.out.print(s+"---");
    }
    }
}
