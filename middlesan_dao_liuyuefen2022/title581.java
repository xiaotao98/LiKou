package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Arrays;

/**
 * 最短无序连续子数组
 *
 * 思路1：复制一个数组，然后将新数组排序，设置左右两个指针，将原数组和新的数组去比较，如果对应的值相等，移动指针，一旦有不等的值，则那个指针停止移动
 *
 * 思路2：从左到右循环，记录最大值为 max，若 nums[i] < max, 则表明位置 i 需要调整, 一直到循环结束，记录需要调整的最大位置 i 为 high;
 * 同理，从右到左循环，记录最小值为 min, 若 nums[i] > min, 则表明位置 i 需要调整，一直到循环结束，记录需要调整的最小位置 i 为 low.
 */
public class title581 {

    public static int findUnsortedSubarray(int[] nums) {
        while (nums.length == 1) {//长度为1返回0
            return 0;
        }
        int[] new_arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(new_arr);
        int left = 0, right = nums.length - 1;
        boolean flag_l = true;
        boolean flag_r = true;
        while (left < right && (flag_l || flag_r)) {
            if (new_arr[left] != nums[left]) {
                flag_l = false;
            }
            if (new_arr[left] == nums[left] && flag_l) {
                left++;
            }
            if (new_arr[right] != nums[right]) {
                flag_r = false;
            }
            if (new_arr[right] == nums[right] && flag_r) {
                right--;
            }
        }
        if (left==right){//说明是升序
            return 0;
        }
        return right-left+1;
    }

    public static int findUnsortedSubarray2(int[] nums) {
        while (nums.length == 1) {//长度为1返回0
            return 0;
        }
        int left = 0, right = nums.length - 1;
        int max = nums[0], min = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < max) {
                left = i;
            }
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            if (nums[i] > min) {
                right = i;
            }
        }
        if (left - right <= 0) {
            return 0;
        }
        return left - right + 1;
    }

}
