package 卖票_synchronized;

public class ticket implements Runnable {
     private    int  ticketnumber = 100;

    private Object suo =new Object();
    @Override
    public void run() {
        while(true){

            //同步代码块解决多线程同时访问问题，变量是Object类的对象
            if (ticketnumber >0){

            /*    或者将放大打包对方法加锁
                        public void synchronized fangfa(){}  锁是 this*/



              synchronized (suo) {
                  if (ticketnumber >0) {
                      try {
                          Thread.sleep(100);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                      ticketnumber--;
                      System.out.println("票是有" + Thread.currentThread().getName() + "号窗口售出" + "目前票还有" + ticketnumber);

                  }
              }
            }

        }

    }

}
