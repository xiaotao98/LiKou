package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 寻找峰值
 *
 * 思想：利用二分法找，当前mid指向的数字比后面的一个数字大  去前面找   否则去后面找
 */
public class title162 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int i = findPeakElement(nums);
        System.out.println(i);
    }
    public static int findPeakElement(int[] nums) {
        int left=0,right= nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (mid== nums.length-1){//防止下面的mid+1越界
                return mid;
            }
            if (nums[mid]>nums[mid+1]){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return left;
    }
}
