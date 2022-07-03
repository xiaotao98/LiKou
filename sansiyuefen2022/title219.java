package com.LiKou.simple.sansiyuefen2022;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 思路：方法1：我的这个是暴力解法
 * <p>
 * 方法2：利用map
 */
public class title219 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int k = 3;
        boolean bool = containsNearbyDuplicate1(nums, k);
        System.out.println(bool);
    }

    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        if (nums.length == 1) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + k;
            for (int i1 = i + 1; i1 <= j && i1 < nums.length; i1++) {
                if (nums[i] == nums[i1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])&&Math.abs(i- map.get(nums[i]))<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }

}
