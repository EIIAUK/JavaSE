package InnerClass;

public class innerDemo {
    public static void main(String[] args) {
        innerclass a = new innerclass();
/*
        //如何创建内部类对象
        //外部类.内部类 对象名 = new 外部类对象().new内部类对象()
        innerclass.inner i = new innerclass().new inner();
        i.show();*/
        a.method();
    }

}
