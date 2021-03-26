package 异常;

public class TryCathDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        menth();
        System.out.println("结束");
    }
    public static void menth(){

        //自己写异常而不用jvm自带的异常处理 是因为 当出现异常的时候可以不阻断程序进行
        try {
            int []a = {1,2,3};
            System.out.println(a[3]);

        }catch (ArrayIndexOutOfBoundsException e){
         //   System.out.println("这里出现异常");
        //    e.printStackTrace();

            //Throwable 中的方法
           // System.out.println(e.getMessage());
            System.out.println(e.toString());

        }

        }
        //throws 处理异常 只是抛出异常  要想进行 在调用者必须要try/catch 处理异常
    public static void meth2() throws ArrayIndexOutOfBoundsException{
        int []b = {1,2,3};
        System.out.println(b[3]);
    }
}
