package 接口的默认静态抽象方法;

public interface Inter {
    void show();
    default  void method(){
        System.out.println("默认方法");
    }
    public static void test(){
        System.out.println("静态方法");
    }
}
