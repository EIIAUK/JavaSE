package Reflect;

        /*
        * 通过反射实现：
        * Student s = new Student();
        * s.name = "zhangsan"
        * s.age = 30
        * s.classroom = 5B
        * sout(s);
        *
        *
        * */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldFrom {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("Reflect.Student");
      //  取出构造方法
        Constructor<?> con = c.getConstructor();
        //创建对象 将数据存入
        Object obj = con.newInstance();

        //取出变量
        Field  name = c.getDeclaredField("name");
        Field age = c.getDeclaredField("age");
        Field classrom = c.getDeclaredField("classrom");
    //私有成员暴力反射
    name.setAccessible(true);
    age.setAccessible(true);
    classrom.setAccessible(true);

    //添加数据
        name.set(obj,"zhangsan");
        age.set(obj,20);
        classrom.set(obj,"5B");
        System.out.println(obj);
    }
}
