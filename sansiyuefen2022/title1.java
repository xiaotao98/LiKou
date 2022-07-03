package com.LiKou.simple.sansiyuefen2022;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * <p>
 * 思路1：暴力解法
 * <p>
 * 思路2：利用map
 */
public class title1 {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int[] ints = twoSum(nums, 9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }


    public static int[] twoSum1(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();//键存的是目前这个数到达target还需要的值   值存的是下标
        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(nums[i])) {
                arr[0] = map.get(nums[i]);//第一个值下标
                arr[1] = i;//目前这个值下标
                break;
            }
            map.put(target - nums[i], i);
        }
        return arr;
    }
}
