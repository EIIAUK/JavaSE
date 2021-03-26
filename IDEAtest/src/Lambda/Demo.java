package Lambda;

public class Demo {
    public static void main(String[] args) {
      /*  StartThread s = new StartThread();
        Thread ss = new Thread(s);
        ss.start();*/


        //匿名内部类
       /* new Thread() {
            @Override
            public void run() {
                System.out.println("线程启动成功");
            }
        }.start();*/

        //Lambda表达式
        new Thread(() ->{
            System.out.println("线程启动成功");
        }).start();
    }

}
