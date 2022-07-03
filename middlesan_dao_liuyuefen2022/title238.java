package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 除自身以外数组的乘积
 * <p>
 * 思路：构建一个数组arr，首先从左开始遍历目标数组，存目标数左边的乘积。得到每一位左边数乘积的中间数组。
 * 然后从右开始遍历中间数组，将右边乘积乘以中间数组的当前数，就得到了左右乘积之和.
 */
public class title238 {

    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 1;
        int right = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left = left * nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] = arr[i] * right;
            right = right * nums[i];
        }
        return arr;
    }

}
