package Lambda;

public class EatableDemo  {
    public static void main(String[] args) {
       Eatable e = new EatableImpl();
        useEatebl(e);
        //匿名内部类
       useEatebl(new Eatable() {
           @Override
           public void eat() {
               System.out.println("hhah");
           }
       });

       //lambda
        useEatebl(()->{
            System.out.println("chifan a ");
        });

    }


    //必须要有一个方法 调用接口中的方法
    private static void useEatebl(Eatable e) {
        e.eat();
    }



}
