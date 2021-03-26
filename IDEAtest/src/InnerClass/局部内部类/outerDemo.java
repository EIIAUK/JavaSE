package InnerClass.局部内部类;


//局部内部类是在方法中创建类，所以外部是无法直接使用，需要在方法中创建对象和方法
public class outerDemo {
    public static void main(String[] args) {
        outer o = new outer();
        o.mentho();

    }
}
