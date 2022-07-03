package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.HashSet;
import java.util.Set;

/**
 * 最长连续序列
 * <p>
 * 思路：首先把所有的数存到set中，然后去set中找连续序列开头的那个数   比如2，3，4  找2然后判断    4，5，6，7找4判断
 */
public class title128 {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max = 0;
        for (Integer i : set) {
            int count = 0;
            if (!set.contains(i - 1)) {//说明这个数是连续序列的开头数字
                while (set.contains(i + 1)) {
                    count++;//对连续序列计数
                    i++;
                }
            }
            max = Math.max(max, count + 1);
        }
        return max;
    }

}
