package com.LiKou.simple.liuyuefen2022;

/**
 * 按奇偶排序数组
 *
 * 思路：设置一个left指针   只要遍历到偶数，就将这个数和left指针所指的数交换   然后left++
 */
public class title905 {

    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        return nums;
    }
}
