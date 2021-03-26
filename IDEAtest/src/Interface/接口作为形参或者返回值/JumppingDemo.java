package Interface.接口作为形参或者返回值;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperateor jo = new JumppingOperateor();
        Jumpping j = new cat();
        jo.useJumpping(j); //把cat对象的j传到useJumpping中的形式参数j，调用j.jump
    }

}
