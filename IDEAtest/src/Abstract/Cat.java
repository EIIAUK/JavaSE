package Abstract;

public class Cat extends animal{

    @Override   //父类抽象方法限制子类必须重写抽象方法
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
      //  super.sleep();
        System.out.println("睡觉");
    }
}
