package com.LiKou.simple.liuyuefen2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 找到和最大的长度为 K 的子序列
 * <p>
 * 思路：先复制一个数组，然后将他排序，将最大的k个数放到map中去。
 * 然后遍历原来数组，只要出现在map的键中，就将他放到结果数组中，如果map中键对应的值是1，删除，否则将值减1
 */
public class title2099 {

    public static int[] maxSubsequence(int[] nums, int k) {
        int[] rst = new int[k];
        int[] new_arr = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(new_arr);
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = new_arr.length - 1; i >= 0; i--) {
            map.put(new_arr[i], map.getOrDefault(new_arr[i], 0) + 1);
            count++;
            if (count == k) {
                break;
            }
        }
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                rst[x] = nums[i];
                if (map.get(nums[i]) > 1) {
                    map.put(nums[i], map.get(nums[i]) - 1);
                } else {
                    map.remove(nums[i]);
                }
                x++;
            }
        }
        return rst;
    }

}
