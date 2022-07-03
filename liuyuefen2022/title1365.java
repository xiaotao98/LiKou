package com.LiKou.simple.liuyuefen2022;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 有多少小于当前数字的数字
 * <p>
 * 思路1：暴力解法，双层for  O(n^2)
 * <p>
 * 思路2：排序加哈希   O(nlogn)
 */
public class title1365 {

    /**
     * 1
     */
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] rst = new int[nums.length];
        for (int i = 0; i < rst.length; i++) {
            int count = 0;
            int jizhun = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < jizhun) {
                    count++;
                }
            }
            rst[i] = count;
        }
        return rst;
    }

    /**
     * 2
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] rst = new int[nums.length];
        int[] new_arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(new_arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < new_arr.length; i++) {
            if (!map.containsKey(new_arr[i])) {
                map.put(new_arr[i], i);
            }
        }
        for (int i = 0; i < rst.length; i++) {
            rst[i] = map.get(nums[i]);
        }
        return rst;
    }

}
