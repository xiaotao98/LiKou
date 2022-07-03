package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 * <p>
 * 思路：先用二分法去数组找目标值，如过没找到，直接返回结果数组，否则找到了，那么就从找到的位置定义两个指针，一个向前，一个向后，即可。
 */
public class title34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] arr = searchRange(nums, 8);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        int left = 0, right = nums.length - 1;
        int aid = -1;//定义的是目标值在数组中的位置
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                aid = mid;
                break;//找到了，注意结束循环
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (aid == -1) {// 说明没找到目标值
            return arr;
        }
        // 说明找到目标值
        int l = aid, r = aid;
        while (l >= 0 && nums[l] == target) {// 从目标值向前找
            arr[0] = l;
            l--;
        }
        while (r < nums.length && nums[r] == target) {// 从目标值向后找
            arr[1] = r;
            r++;
        }
        return arr;
    }
}
