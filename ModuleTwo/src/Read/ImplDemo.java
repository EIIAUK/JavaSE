package Read;

import Student.Classroom;

import java.util.ServiceLoader;

public class ImplDemo {
    public static void main(String[] args) {
        ServiceLoader<Classroom> load = ServiceLoader.load(Classroom.class);//加载接口
        for (Classroom a :load){  //遍历接口
            a.classroom();   //调用接口实现的方法

        }
    }
}
