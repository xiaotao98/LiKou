package com.LiKou.simple.liuyuefen2022;

/**
 * 最小差值 I
 *
 * 思路：找到数组中的最大值和最小值，如果他们的差大于2k  返回max - min - 2 * k  否则返回0
 */
public class title908 {
    public  int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        if (max - min >= 2 * k) {
            return max - min - 2 * k;
        }
        return 0;
    }
}
