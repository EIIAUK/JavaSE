package baidu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class baidudemo {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        Scanner ii = new Scanner(System.in);
        int in = ii.nextInt();
        int[] a = new int[in];
        for(int i = 0; i <a.length;i++){
            a[i] =sc.nextInt();
        }
        System.out.println(solution(in,a));


    }

    public static int solution(int in,int[] nums) {
        int[] dp1 = new int[10];
        Arrays.fill(dp1,Integer.MAX_VALUE);
        int[] dp = new int[nums.length];
        dp[0] = 0;
        dp1[nums[0] ]=0;
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.min(dp[i-1],dp1[nums[i]])+1;
            dp1[nums[i]]= Math.min(dp1[nums[i]],dp[i]);
        }
        return  dp[nums.length -1];
    }

}
