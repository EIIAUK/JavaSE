package 可变数组;

public class Demo {
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(10, 20, 30, 40, 50));
    }
        public static int sum(int b,int... a ){   //a其实是一个数组 如果包含多个参数，可变参数应该放在最后
            int sum = 0;
            for(int s: a){

                sum += s;
            }
            return sum;
        }




}
