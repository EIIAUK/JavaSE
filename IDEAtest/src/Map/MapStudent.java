package Map;

import ListDemo.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapStudent {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",2);
        Student s2 = new Student("lisi",3);
        Student s3 = new Student("wangwu",4);

        HashMap<String,Student> map  = new HashMap<String,Student>();
        map.put("学生1",s1);
        map.put("学生2",s2);
        map.put("学生3",s3);

        //遍历 通过键找值
        Set<String> KeySet = map.keySet();  //查找键
        for(String key : KeySet)
        {
            Student value = map.get(key);
            System.out.println(key+ value.getname()+value.getage());
        }






    }
}
