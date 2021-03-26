package Abstract;

public class animalDemo {
    public static void main(String[] args) {
        //抽象类创建对象
        animal cat = new Cat();  //抽象类创建对象必须被子类重写
        cat.eat();
        cat.sleep();

    }
}
