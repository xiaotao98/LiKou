package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 *
 * 思路：回溯算法
 */
public class title46 {
    static List<List<Integer>> list = new ArrayList<>();
    static List<Integer> temp = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = permute(nums);
        System.out.println(list);
    }


    public static List<List<Integer>> permute(int[] nums) {
        dfs(nums, list, temp);
        return list;
    }

    private static void dfs(int[] nums, List<List<Integer>> list, List<Integer> temp) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!temp.contains(nums[i])) {
                temp.add(nums[i]);
                dfs(nums, list, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
