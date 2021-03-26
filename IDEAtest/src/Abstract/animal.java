package Abstract;

public abstract class animal {

    public abstract void eat();      //抽象方法必须在抽象类中
    public void sleep(){
        System.out.println("sleep");   //抽象类可以有非抽象方法
    }

}
