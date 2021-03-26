package Thread;

public class DaemonDemo {
    public static void main(String[] args) {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

     //   t1.setName("AA");
        t2.setName("BB");
        t3.setName("CC");

            //设置主线程
       Thread.currentThread().setName("主线程");

        t2.setDaemon(true);
        t3.setDaemon(true);

      // t1.start();
        t2.start();
        t3.start();

        for (int i = 0 ; i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
