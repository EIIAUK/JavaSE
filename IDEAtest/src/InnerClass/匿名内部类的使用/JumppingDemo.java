package InnerClass.匿名内部类的使用;

public class JumppingDemo {
    public static void main(String[] args) {
        //需求创建接口操作对象，调用method方法

            //创建对象
        Jumpping o =new cat(){
            @Override
            public void jump() {
                System.out.println("所有动物都可以跳高");
            }
        };
//        cat cat = new cat();

        JumppingOperator a = new JumppingOperator();
//        a.menthod(cat);
        a.menthod(o);
    }
}
