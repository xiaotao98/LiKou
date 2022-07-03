package com.LiKou.simple.wuyuefen2022;

import java.util.HashMap;

public class title594 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int i = findLHS(nums);
        System.out.println(i);
    }

    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //把每个元素出现的次数存到map中
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int max = 0;
        for (Integer i : map.keySet()) {
            if (map.containsKey(i + 1)) {
                int sum = map.get(i) + map.get(i + 1);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
