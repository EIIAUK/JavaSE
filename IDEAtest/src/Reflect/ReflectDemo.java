package Reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//通过反射获取类对象
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取class对象
        Class<?> c = Class.forName("Reflect.Student");

        //调用无参构造
        Constructor<?> con = c.getConstructor();

      /*  //取方法的数组 都带s
        Constructor<?>[] constructors = c.getConstructors(); //公共的方法
        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();//私有和默认公共都拿

        //需要传递一个Class参数和个数
        Constructor<?> constructor = c.getConstructor(); //取构造方法
        Constructor<?> declaredConstructor = c.getDeclaredConstructor();//取一个公共私有和默认
*/
        //创建object类
        Object obj = con.newInstance();
        System.out.println(obj);
    }
}
