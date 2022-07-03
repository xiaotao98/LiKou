package com.LiKou.simple.wuyuefen2022;

import java.util.HashSet;
import java.util.Set;

/**
 * 在长度 2N 的数组中找出重复 N 次的元素
 * <p>
 * 思路：nums 包含 n + 1 个 不同的 元素  说明除了要找的元素   其他的元素都不相同  那么就用set集合
 */
public class title961 {
    public static void main(String[] args) {
        int[] nums = {5, 1, 5, 2, 5, 3, 5, 4};
        int i = repeatedNTimes(nums);
        System.out.println(i);
    }

    public static int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            boolean bool = set.add(nums[i]);
            if (!bool) {
                return nums[i];
            }
        }
        return 0;
    }
}
