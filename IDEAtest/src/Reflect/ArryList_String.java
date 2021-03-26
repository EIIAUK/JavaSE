package Reflect;

import 接口的默认静态抽象方法.Inter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

//向ArryList中添加一个String类型的参数
public class ArryList_String {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);

        Class<? extends ArrayList> c = i.getClass();
        Method add = c.getDeclaredMethod("add", Object.class);
        add.invoke(i,"hello");
        add.invoke(i,"world");


        System.out.println(i);


    }
}
