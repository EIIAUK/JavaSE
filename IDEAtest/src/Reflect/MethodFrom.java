package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//反射获得成员方法
public class MethodFrom {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //获取class对象
        Class<?> c= Class.forName("Reflect.Student");

        //获取公共/所有 方法集合
        Method[] methods = c.getMethods();
        Method[] declaredMethods = c.getDeclaredMethods();

        //获取单个公共/所有方法
        Method method = c.getMethod("method1");
        Method method1 = c.getMethod("method1",String.class);
        c.getDeclaredMethod("method4", String.class, int.class);


    }
}
