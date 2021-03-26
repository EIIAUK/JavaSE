package Interface.接口作为形参或者返回值;

public class JumppingOperateor {
    public void useJumpping(Jumpping j ){
        j.jump();  //j可以调用方法，所以是被实例化的
    }
}
