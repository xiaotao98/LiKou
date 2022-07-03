package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 数组中的 k-diff 数对
 * <p>
 * 思路：去重+二分法
 */
public class title532 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 5, 4};
        int k = 0;
        int i = findPairs(nums, k);
        System.out.println(i);


    }

    public static int findPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();//存的是开始数字
        for (int i = 0; i < nums.length; i++) {
            int aid = nums[i] + k;//需要找的目标数字
            if (set.contains(nums[i])) {//说明这个开始数字找过了，直接跳过
                continue;
            } else {
                set.add(nums[i]);
                boolean bool = erfen(nums, aid, i + 1, nums.length - 1);
                if (bool) {
                    count++;
                }
            }
        }
        return count;
    }

    //二分法
    public static boolean erfen(int[] nums, int aid, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == aid) {
                return true;
            }
            if (nums[mid] < aid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
