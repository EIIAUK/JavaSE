package Interface.InterfaceDemo;

public class dog extends Animal implements Jumpping{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("狗可以跳高了");
    }
}
