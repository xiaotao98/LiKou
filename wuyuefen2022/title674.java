package com.LiKou.simple.wuyuefen2022;

public class title674 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        int length = findLengthOfLCIS(nums);
        System.out.println(length);
    }

    public static int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max = -1;
        if (nums.length == 1) {
            return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                count = 1;//不是递增，count变为1
            } else {
                count++;//递增，count++
            }
            if (max < count) {//将更长的赋值给max
                max = count;
            }
        }
        return max;
    }
}
