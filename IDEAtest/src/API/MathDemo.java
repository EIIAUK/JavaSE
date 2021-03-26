package API;

//继承object类
public class MathDemo {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));
//        返回大于或者等于参数的最小double值
        System.out.println(Math.ceil(12.34));
//        返回小于或者等于参数的最大double值
        System.out.println(Math.floor(12.25));
        //四舍五入int值
        System.out.println(Math.round(12.25));
        //返回两个中大的值
        System.out.println(Math.max(12,15));
        //返回两个中小的值
        System.out.println(Math.min(12,15));
        //返回a的b次幂值
        System.out.println(Math.pow(3,2));
        //返回double的正值   【0.0，1.0）之间的随机数
        System.out.println(Math.random());
        System.out.println((int) (Math.random()*100)); //强制转换
        
    }

   

}
