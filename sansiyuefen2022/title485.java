package com.LiKou.simple.sansiyuefen2022;


/**
 * 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
 *
 * 思路：遍历数组，如果数组元素为1  count++   否则  count=0
 *  如果  count>max   max=count
 */
public class title485 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int i = findMaxConsecutiveOnes(nums);
        System.out.println(i);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}
