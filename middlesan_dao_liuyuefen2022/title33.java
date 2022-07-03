package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 搜索旋转排序数组
 * <p>
 * 思路：如果中间的数小于最右边的数，则右半段是有序的，若中间数大于最右边数，则左半段是有序的，
 * 我们只要在有序的半段里用首尾两个数组来判断目标值是否在这一区域内，这样就可以确定保留哪半边了
 */
public class title33 {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int search = search(nums, 3);
        System.out.println(search);


    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < nums[right]) {//右边有序
                if (nums[mid] < target && target <= nums[right]) {//如果target <= nums[right]说明必定在右边
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {//左边有序
                if (nums[mid] > target && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
