package com.LiKou.simple.wuyuefen2022;

import java.util.Arrays;

public class title561 {
    public static void main(String[] args) {
        int[] nums={6,2,6,5,1,2};
        int sum = arrayPairSum(nums);
        System.out.println(sum);
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);//排序，将紧挨着的两个凑成一组，取第一个就可以了
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                sum=sum+nums[i];
            }
        }
        return sum;
    }
}
