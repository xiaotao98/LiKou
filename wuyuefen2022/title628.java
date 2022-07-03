package com.LiKou.simple.wuyuefen2022;

import java.util.Arrays;

/**
 * 三个数的最大乘积
 */
public class title628 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int i = maximumProduct(nums);
        System.out.println(i);
    }

    public static int maximumProduct(int[] nums) {
        //数组排序  然后计算前两个和最后一个乘积或后三个乘积  取其中的最大值即可
        Arrays.sort(nums);
        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0] * nums[1] * nums[nums.length - 1];
        if (a > b) {
            return a;
        }
        return b;
    }
}
