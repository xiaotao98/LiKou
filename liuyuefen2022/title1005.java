package com.LiKou.simple.liuyuefen2022;

import java.util.Arrays;

/**
 * K 次取反后最大化的数组和
 *
 * 思路：首先，排序，在k允许的次数内，把小的负数转为正数，如果k用完了，那么直接对数组求和。
 * 如果k还没用完，代表数组所有数是非负了，再次排序。
 * 那么判断k的奇偶性。k为偶数，直接对数组求和。k为奇数，只需要将最小的那个数乘负1，在对数组求和即可。
 */
public class title1005 {

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {//在k允许的次数内，先把负数变为正数
            if (k > 0) {
                if (nums[i] < 0) {
                    nums[i] = nums[i] * -1;
                    k--;
                }
            } else {
                break;
            }
        }
        Arrays.sort(nums);
        if (k % 2 != 0) {//如果现在的k为奇数，需要在把最小的变为负数在求和    k为偶数 直接求和
            nums[0] = nums[0] * -1;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

}
