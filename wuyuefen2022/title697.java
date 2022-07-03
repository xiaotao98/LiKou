package com.LiKou.simple.wuyuefen2022;

import java.util.*;

/**
 * 数组的度
 * <p>
 * 思路：先找到出现次数最多的元素(可能有多个)，然后确定数组的度 然后选取度长度最小的连续数组
 */
public class title697 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        int i = findShortestSubArray(nums);
        System.out.println(i);

    }


    public static int findShortestSubArray(int[] nums) {
        int len = nums.length;
        int du = 0;
        Map<Integer, Integer> map = new HashMap<>();//map记录元素以及出现的次数
        List<Integer> list = new ArrayList<>();//list用来记录出现次数最多的元素
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            if (value > du) {
                du = value;
            }
        }
        Set<Integer> keySet = map.keySet();
        for (int i : keySet) {// 在list中保存出现次数最多的数
            if (map.get(i) == du) {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {//遍历list，找最小区间
            int left = 0, right = 0;// left记录的是第一次出现的位置 right记录的是最后一次出现的位置
            int a = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == list.get(i) && a < 1) {// left记录的是第一次出现的位置
                    left = j;
                    a++;
                }
                if (nums[j] == list.get(i)) {// left记录的是第一次出现的位置
                    right = j;
                }
            }
            if (right - left + 1 < len) {// 记录更小的区间
                len = right - left + 1;
            }
        }
        return len;
    }
}
