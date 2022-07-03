package com.LiKou.simple.wuyuefen2022;

/**
 * 寻找数组的中心下标
 */
public class title724 {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int index = pivotIndex(nums);
        System.out.println(index);
    }
    public static int pivotIndex(int[] nums) {
        int left_sum = 0,sum=0;
        for (int i :nums) {
            sum=sum+i;
        }
        for (int i = 0; i < nums.length; i++) {
            left_sum=left_sum+nums[i];
            if (2*left_sum==(sum+nums[i])) {//左边数组之和*2  重复了中心元素   所以这里要让sum加上
                return i;
            }
        }
        return -1;
    }
}
