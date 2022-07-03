package com.LiKou.simple.liuyuefen2022;

import java.util.Arrays;

/**
 * 三角形的最大周长
 * <p>
 * 思路：给数组排序，然后遍历最大的相邻三个元素即可。如果不满足，指针下移一位
 */
public class title976 {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int index = nums.length - 1;
        while (index >= 2) {
            int a = nums[index];
            int b = nums[index - 1];
            int c = nums[index - 2];
            boolean bool = judge(a, b, c);
            if (bool) {
                return a + b + c;
            }
            index--;
        }
        return 0;
    }

    /**
     *判断能否围成三角形
     */
    public static boolean judge(int a, int b, int c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }
}
