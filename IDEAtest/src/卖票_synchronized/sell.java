package 卖票_synchronized;

public class sell {
    public static void main(String[] args) {
       /* Thread t1 = new Thread(new ticket(),"1");
        Thread t2 = new Thread(new ticket(),"2");
        Thread t3 = new Thread(new ticket(),"3");

                错误方法

        t1.start();
        t2.start();
        t3.start();
*/

        ticket st = new ticket();
        Thread t1 = new Thread(st,"1");
        Thread t3 = new Thread(st,"2");
        Thread t2 = new Thread(st,"3");
        t1.start();
        t2.start();
        t3.start();

    }
}
