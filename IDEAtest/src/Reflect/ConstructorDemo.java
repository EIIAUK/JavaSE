package Reflect;

import java.io.File;
import java.lang.reflect.Field;

//反射去除成员变量
public class ConstructorDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        Class<?> c = Class.forName("Reflect.Student");

        //获取公共/所有的成员对象
        Field[] file  = c.getFields();
        Field [] file2 = c.getDeclaredFields();

        //获取单个成员对象/根据成员名字
        Field file3 = c.getField("name");
        Field file4 = c.getDeclaredField("name");
    }
}
