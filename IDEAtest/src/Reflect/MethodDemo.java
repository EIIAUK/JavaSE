package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
            * 通过反射完成以下需求
            * Student s = new student()
            * s.mentod1();
            * s.menthod2("zhangsan");
            * s.menthod3
            * String ss = s.menthod4("zhansan",20)
            * sout(ss)
            *s.function();
            * */
public class MethodDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> c= Class.forName("Reflect.Student");

        Constructor<?> con =c.getConstructor();

        Object obj1 = con.newInstance();
        Method menthod1 = c.getMethod("method1");
        menthod1.invoke(obj1);


        Method method3 = c.getDeclaredMethod("method3");

        method3.setAccessible(true);//暴力反射
        method3.invoke(obj1);


        Method method2 = c.getDeclaredMethod("method2", String.class);
         method2.invoke(obj1,"张三");
       // System.out.println(obj2);

        Method method4 = c.getDeclaredMethod("method4", String.class, int.class);
       Object o  =method4.invoke(obj1,"zhangsan",5);
        System.out.println(o);


    }
}
