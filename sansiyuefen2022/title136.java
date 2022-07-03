package com.LiKou.simple.sansiyuefen2022;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * 思路：
 * 拿数组中每一个数字去和其他数字作比较，
 * 当和数组中数字相同，且下标不同，代表，这是相同的数。
 * 更换比较的数字，同时令i为-1，重头比较
 */
public class title136 {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        int result = singleNumber(nums);
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        int j=0;
        int result=nums[j];

        for (int i = 0; i < nums.length; i++) {
            if (result==nums[i]&&i!=j){
                j++;
                result=nums[j];
                i=-1;
            }
        }
        return result;
    }

}
