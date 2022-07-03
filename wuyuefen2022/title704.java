package com.LiKou.simple.wuyuefen2022;

/**
 * 二分查找
 */
public class title704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int i = search(nums, 9);
        System.out.println(i);
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {//小于等于是关键
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
