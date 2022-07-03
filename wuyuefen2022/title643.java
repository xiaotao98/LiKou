package com.LiKou.simple.wuyuefen2022;

/**
 * 子数组最大平均数 I
 *
 * 思路：利用滑动窗口的思想   可以很快做出来
 */
public class title643 {
    public static void main(String[] args) {
        int[] nums = {-1};
        double result = findMaxAverage(nums, 1);
        System.out.println(result);
    }

    public static double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {//假设前面k个数值的和最大
            max = max + nums[i];
        }
        int temp=max;
        for (int i = k; i < nums.length ; i++) {//计算其他的k个数值大小
             temp = temp - nums[i-k] + nums[i];//temp一直在改变
            if (temp > max) {
                max = temp;
            }
        }
        return max / (double) k;   //找最大的k个数值和   然后求平均
    }
}
