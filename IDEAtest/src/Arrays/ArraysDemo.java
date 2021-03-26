package Arrays;

import java.util.Arrays;
//Arrays.toString(arrys)  返回arry中的全部内容
//Arrays.sort(arrys)   排序
public class ArraysDemo {
    public static void main(String[] args) {
        int[] a = {2,5,4,1,8};
        System.out.println("排序前"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序后"+ Arrays.toString(a));
    }
}
