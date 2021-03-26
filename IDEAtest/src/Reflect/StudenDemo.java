package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
利用反射实现
Student s = new Student("张三","20","5班");
sout（s）*/
public class StudenDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //创建一个class对象
        Class<?> c = Class.forName("Reflect.Student");
        //取出有三个参数的方法
        Constructor<?> cons = c.getConstructor(String.class, int.class, String.class);
        Object obj = cons.newInstance("张三",20,"5班");
        System.out.println(obj);

    }

}
