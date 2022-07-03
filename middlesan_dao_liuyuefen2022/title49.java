package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.*;

/**
 * 字母异位词分组
 * <p>
 * 思路：利用map<String,ArrayList<String>>  将每个单词变成字符数组，然后排序  转为字符串  这样就可以判断他们是不是异位词了
 */
public class title49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(key, temp);
            } else {
                map.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}
