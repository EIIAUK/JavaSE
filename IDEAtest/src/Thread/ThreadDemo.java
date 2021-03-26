package Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();
        ThreadSleep t3 = new ThreadSleep();

        t1.setName("AA");
        t2.setName("BB");
        t3.setName("CC");

        t1.start();
        t2.start();
        t3.start();




    }
}
