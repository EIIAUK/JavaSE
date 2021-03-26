package Set;


import java.util.HashSet;
import java.util.Set;

/*set集合是一个不包含重复元素
没有带索引的方法，所以不能使用普通for循环遍历
hashset:对集合迭代顺序不做任何保证
*/
public class setDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("3");   //不包含重复元素 所以add不进去
        for(String s : set){
            System.out.print(s+" ");
        }

    }
}
