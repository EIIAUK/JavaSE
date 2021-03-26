package InnerClass;

/*内部类可以直接访问外部类的成员，包括私有
外部类要访问内部类的成员，必须创建对象*/
public class innerclass {
    private int num = 10;



   /* public  class inner{

        public void show(){
            System.out.println(num); // 内部类可以直接访问外部类的所有成员
        }

    }*/

    private class inner {

        public void show() {
            System.out.println(num); // 内部类可以直接访问外部类的所有成员
        }
    }
        //内部类就是为了不想让别人看到，所以在使用的时候在外部类中创建一个方法来访问内部类
    public void method(){
        inner i = new inner();
        i.show();
    }
}