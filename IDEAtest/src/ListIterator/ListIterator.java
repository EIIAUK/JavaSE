package ListIterator;


import java.util.ArrayList;
import java.util.List;

/*

E next(): 返回迭代器中的下一个元素
boolean hasNext(): 弱国迭代具有多个元素 则返回true
E previous (): 返回列表中的上一个元素
boolean hasPrevious(): 如果此迭代器中在相反方向遍历列表时 具有更多元素 则返回true
void add(E e):将指定的元素插入列表


*/
public class ListIterator<S> {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加集合元素
        list.add("1");
        list.add("2");
        list.add("3");
        //通过list集合的lisiterator（）方法遍历

        java.util.ListIterator<String> lit = list.listIterator();
  /*    while(lit.hasNext()){    //判断是否有下一个元素

          String s = lit.next();
          System.out.println(s);
    }


      //    以此输出前一个元素：注意如果从头开始则会判断之前没有元素
            while(lit.hasPrevious()){
                String s = lit.previous();
                System.out.println(s);
            }

            */
     while (lit.hasNext()){

          String s = lit.next();
          if(s.equals("2")){
              list.add("two");   //此处可能出现 预计数与实际数不相符合
              System.out.println(list);
          }

      }


}
}
