package API;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        //终止当前java
       // System.exit(0);
        System.out.println("结束");
        //返回当前时间 毫秒值
        System.out.println( System.currentTimeMillis() * 1.0/1000/60/60/24/365 );

    //计算运行耗时
        long start = System.currentTimeMillis();
        for (int i =0;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+ (end - start)+"毫秒");
    }
}
