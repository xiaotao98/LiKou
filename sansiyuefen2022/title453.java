package com.LiKou.simple.sansiyuefen2022;

/**
 * 思路：  n-1个元素+1  等价于  1个元素-1
 * 于是，要计算让数组中所有元素相等的操作数，
 * 我们只需要计算将数组中所有元素都减少到数组中元素最小值所需的操作数
 */
public class title453 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int result = minMoves(nums);
        System.out.println(result);
    }

    public static int minMoves(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i] - min;
        }
        return sum;
    }
}
