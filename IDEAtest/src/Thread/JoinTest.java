package Thread;

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

        t1.setName("AA");
        t2.setName("BB");
        t3.setName("CC");

        //等待这个线程执行完成死亡这个线程执行完成才可以执行其他的
        t1.join();

        t1.start();
        t2.start();
        t3.start();
    }
}
