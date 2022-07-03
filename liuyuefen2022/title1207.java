package com.LiKou.simple.liuyuefen2022;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 独一无二的出现次数
 * <p>
 * 思路：用map记录每个数字出现的次数，然后将次数存到set中，如果set添加失败，返回false
 */
public class title1207 {

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            boolean bool = set.add(value);
            if (!bool) {
                return false;
            }
        }
        return true;
    }

}
