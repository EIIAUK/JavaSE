package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*Student s = new Student("林青霞")；
        sout（s）*/
public class ConstructorForm {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("Reflect.Student");
        Constructor<?> con = c.getDeclaredConstructor(String.class);


        //暴力反射  (私有构造方法不能创建对象---所以要设为true)
        con.setAccessible(true);

        Object obj = con.newInstance("张三");
        System.out.println(obj);


    }
}
