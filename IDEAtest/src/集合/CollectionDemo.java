package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo<S> {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("word");
        c.add("java");

        c.remove("java");
        System.out.println(  c.contains("java")); //p判断是否有这个元素
       // System.out.println(c);
        System.out.println(

        c.isEmpty());;
        System.out.println(c.size());


        //迭代器遍历
        Iterator<String> i = c.iterator();
       while (i.hasNext()){
           System.out.print("-"+i.next());

       }
    }
}
