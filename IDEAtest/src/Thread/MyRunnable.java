package Thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程名字:"+ Thread.currentThread().getName() + i);
        }
    }
}
