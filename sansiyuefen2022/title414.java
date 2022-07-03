package com.LiKou.simple.sansiyuefen2022;

import java.util.Arrays;

/**
 * 给你一个非空数组，返回此数组中 第三大的数 。
 * 如果不存在，则返回数组中最大的数。
 */
public class title414 {
    public static void main(String[] args) {
        int nums[]={0,1,2,6,5,4,9,8};
        int thirdMax = thirdMax(nums);
        System.out.println(thirdMax);
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);//首先从小到大排序
        int index=1,max=nums[nums.length-1];//index记录大数
        for (int i=nums.length-2;i>=0;i--){//数组从后往前遍历
            if (nums[i]<max){//找到比大数小的数
                max=nums[i];
                index++;
                if (index==3){//当index==3  说明这个数就是要找的数
                    return nums[i];
                }
            }
        }
        return nums[nums.length-1];//走到这一步，说明没有找到第三大的数，直接返回最大的数
    }
}
