package com.LiKou.simple.wuyuefen2022;

import java.util.Arrays;

/**
 *  至少是其他数字两倍的最大数
 *
 *  先复制一个数组  然后排序，找到最大值  然后判断   最后找最大值的位置
 */
public class title747 {
    public static void main(String[] args) {

    }

    public static int dominantIndex(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        if (nums.length == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        if (max >= nums[nums.length - 2] * 2) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {
                    return i;
                }
            }
        }
        return -1;
    }
}
