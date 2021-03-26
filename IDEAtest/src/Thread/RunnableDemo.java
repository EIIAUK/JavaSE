package Thread;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable t1 = new MyRunnable();
        Thread t2 = new Thread(t1);
        t2.setName("高铁");

        //或者
        Thread t3 = new Thread(new MyRunnable(),"飞机");

        t2.start();
        t3.start();
    }
}
