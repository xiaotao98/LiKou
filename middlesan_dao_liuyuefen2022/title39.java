package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合总和
 * <p>
 * 思路：使用回溯法
 */
public class title39 {

    static List<List<Integer>> list1 = new ArrayList<>();
    static List<Integer> temp = new ArrayList<>();

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> lists = combinationSum(candidates, target);
        System.out.println(lists);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        back(candidates, target, 0, 0);
        return list1;
    }

    private static void back(int[] candidates, int target, int sum, int index) {
        if (sum > target) {
            return;
        } else if (sum == target) {
            list1.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            temp.add(candidates[i]);
            back(candidates, target, sum + candidates[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}
