package Integer;


import java.lang.reflect.Array;
import java.util.Arrays;

//需求：输入 ” 91 27 46 38 50“ 字符串  输出 “27 38 46 50 91”
public class sortDemo {
    public static void main(String[] args) {

        String a = "91 27 46 38 95";
        String  [] arr;
        arr=  a.split(" ");  //分离
        int b =arr.length;
        int [] ins = new int[b];
        System.out.println(Arrays.toString(arr));

            for (int i=0;i< arr.length;i++){
                ins[i] = Integer.parseInt(arr[i]);
            }  //循环将分割后的字符串转为int类型存在int数组中

        Arrays.sort(ins); //排序
        System.out.println(Arrays.toString(ins));
//
//        最后存在一个数组里
            StringBuilder s = new StringBuilder();
            for (int i = 0; i<ins.length;i++)
            {
                if (i == ins.length-1) {    //判断是不是最后一个元素
                    s.append(ins[i]);
                }
                else {
                    s.append(ins[i]).append(" ");
                }
            }
        System.out.println("最后string:"+s);
    }
}
