package HashCode;

import List.Student;
import org.w3c.dom.ls.LSOutput;

public class HashCodeDemo {

    public static void main(String[] args) {
//        同一对象哈希值相同，不同对象哈希值不同
        Student s1 = new Student("liming", 1);
        System.out.println(s1.hashCode()); //2129789493
        System.out.println(s1.hashCode()); //2129789493

        Student s2 = new Student("liming", 1);
        System.out.println(s2.hashCode()); //668386784


//        哈希值重写string字符串
        System.out.println("重地".hashCode()); //1179395
        System.out.println("通话".hashCode()); //1179395
    }
}
