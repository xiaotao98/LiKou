package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 前 K 个高频元素
 *
 * 思路：首先统计数组的每个元素  以及出现的次数。然后将map.entry塞到list中，将list按照map.entry的value值进行降序排列
 */
public class title347 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] i = topKFrequent(nums, k);
        for (int j : i) {
            System.out.println(j);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] rst = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());//关键
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());//将list按照value的值降序排列
        for (int i = 0; i < k; i++) {
            rst[i] = list.get(i).getKey();
        }
        return rst;
    }

}
